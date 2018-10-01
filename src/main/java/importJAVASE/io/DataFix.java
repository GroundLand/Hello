package importJAVASE.io;

import com.google.common.io.PatternFilenameFilter;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.regex.Pattern;

/**
 *
 * @author cln
 * @version $Id: DataFix.java v 0.1 18-9-27 下午2:49 cln Exp $$
 */
public class DataFix {

    public static final String DATE_FORMAT = "yyyy-MM-dd";

    public static void main(String args[]) throws IOException {
        File dire = new File("/home/c/Documents/datafix");

        PatternFilenameFilter patternFilenameFilter = new PatternFilenameFilter(Pattern.compile(".*tsv"));
        File[] files = dire.listFiles(patternFilenameFilter);
        int total = 0;
        for (File file : files) {
            String companyId = file.getName().replace(".tsv", "");
            System.out.println(companyId);
            List<ContractData> dataList = new ArrayList<>();
            FileInputStream fis = null;
            int row = 0;

            //读取数据
            try {
                fis = new FileInputStream(file);
                InputStreamReader isr = null;
                try {
                    isr = new InputStreamReader(fis);
                    BufferedReader bufferedReader = new BufferedReader(isr);
                    String line;
                    while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                        String[] strings = line.split("\t");
                        ContractData data = new ContractData();
                        data.setContractId(Integer.parseInt(strings[0]));
                        data.setContractAmount(new BigDecimal(strings[1]));
                        data.setExpireDate(parseDate(strings[2]));
                        data.setPriceAmount(new BigDecimal(strings[3]));
                        data.setPriceId(Integer.parseInt(strings[4]));
                        data.setEndDate(parseDate(strings[5]));
                        data.setContractAgreementId(Integer.parseInt(strings[6]));
                        dataList.add(data);
                    }
                } finally {
                    isr.close();
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                fis.close();
            }

            //数据处理
            Map<Integer, ContractData> map = new LinkedHashMap<>();
            for (ContractData contractData : dataList) {
                Integer caId = contractData.getContractAgreementId();
                ContractData data = map.get(caId);
                if (data != null && data.getEndDate().compareTo(contractData.getEndDate()) > 0) {
                    contractData = data;
                }
                map.put(caId, contractData);
            }

            //拼写sql语句
            List<String> updateList = new ArrayList<>();
            int i = 0;
            for (ContractData contractData : map.values()) {
                //如果合同的到期日期与合同服务项中的结束日期差为1
                int duration = Months.monthsBetween(contractData.getEndDate(), contractData.getExpireDate()).getMonths();
                if (duration == 1) {
                    DateTime newEndDate = contractData.getEndDate().plusMonths(1);
                    String contractUpdate = "update am_cm_contract set amount=amount+" + contractData.getPriceAmount() + " where id=" + contractData.getContractId() + ";\n";
                    String priceUpdate = contractUpdate + "update am_cm_agreement_charge set end_date=\'" + newEndDate.toString(DATE_FORMAT) + "\' where id=" + contractData.getPriceId();
                    updateList.add(priceUpdate);
                    i++;
                }

            }

            System.out.println("此次修复数据数量为   " + i);
            total += i;
            String updateString = updateList.toString().replaceAll("\\[|\\]", "").replace(", ", ";\n");
            updateString = updateString + ";";
            File fileOut = new File("/home/c/Documents/datafix/" + companyId + "_" + i + ".sql");
            FileOutputStream fos = null;
            OutputStreamWriter osw = null;
            try {
                fos = new FileOutputStream(fileOut);
                osw = new OutputStreamWriter(fos);
                osw.write(updateString);
            } finally {

                osw.close();
                fos.close();
            }

            System.out.println(updateString);

        }

        System.out.println("总共" + total + "条");
    }

    private static DateTime parseDate(String dateStr) {
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
        return DateTime.parse(dateStr, dtf);

    }
}
