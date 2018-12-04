package importJAVASE.io;

import com.google.common.io.PatternFilenameFilter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author cln
 * @version $Id: DataFix2.java v 0.1 18-10-18 上午11:22 cln Exp $$
 */
public class DataFix2 {
    public static void main(String args[]) throws IOException {
        File dire = new File("/home/c/Documents/datafix");

        PatternFilenameFilter patternFilenameFilter = new PatternFilenameFilter(Pattern.compile(".*txt"));
        File[] files = dire.listFiles(patternFilenameFilter);
        int total = 0;

        List<Contract2> contractList = new ArrayList<>();
        List<Customer2> customerList = new ArrayList<>();
        for (File file : files) {
            String fileName = file.getName().replace(".txt", "");
            System.out.println(fileName);
            if ("contract".equals(fileName)) {

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
                            Contract2 contract = new Contract2();
                            contract.setId(Integer.parseInt(strings[1]));
                            contract.setContractNo(strings[2]);
                            contract.setEffectiveDate(strings[3]);
                            contract.setExpiredDate(strings[4]);
                            contract.setCreateDate(strings[5]);
                            contract.setName(strings[6]);
                            contract.setCustomerId(strings[7]);
                            contract.setCompanyId(strings[8]);
                            contractList.add(contract);
                        }
                    } finally {
                        isr.close();
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    fis.close();
                }
            }

            if ("customer".equals(fileName)) {

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
                            Customer2 customer = new Customer2();
                            customer.setId(strings[1]);
                            customer.setFullName(strings[2]);
                            customer.setShortName(strings[3]);
                            customerList.add(customer);
                        }
                    } finally {
                        isr.close();
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    fis.close();
                }
            }

        }
        Map<String, Customer2> customerMap = customerList.stream().collect(
                Collectors.toMap(Customer2::getId, Function.identity()));
        Map<Integer, Contract2> contract2Map = new LinkedHashMap<>();
        for (Contract2 contract : contractList) {
            Contract2 result = contract2Map.get(contract.getId());
            if (result == null) {
                Customer2 company = customerMap.get(contract.getCompanyId());
                Customer2 customer = customerMap.get(contract.getCustomerId());
                if (company == null) {
                    System.out.println(contract.getCompanyId() + "为null");
                    continue;
                }
                if (customer == null) {
                    System.out.println(contract.getCompanyId() + "为null");
                    continue;
                }
                contract.setCompanyFullName(company.getFullName());
                contract.setCompanyShortName(company.getShortName());
                contract.setCustomerFullName(customer.getFullName());
                contract.setCustomerShortName(customer.getShortName());
                result = contract;
            } else {
                result.setName(result.getName() + ";" + contract.getName());
            }
            contract2Map.put(contract.getId(), result);
        }
        List<Contract2> contract2List = new ArrayList<>(contract2Map.values());
        System.out.println(customerList);
        System.out.println(contract2List);
        List<String> stringList = new ArrayList<>();
        for (Contract2 contract2 : contract2List) {
            String str = contract2.getId() + "";
            str += "\t" + contract2.getContractNo();
            str += "\t" + contract2.getEffectiveDate();
            str += "\t" + contract2.getExpiredDate();
            str += "\t" + contract2.getCreateDate();
            str += "\t" + contract2.getName();
            str += "\t" + contract2.getCompanyId();
            str += "\t" + contract2.getCompanyFullName();
            str += "\t" + contract2.getCompanyShortName();
            str += "\t" + contract2.getCustomerId();
            str += "\t" + contract2.getCustomerFullName();
            str += "\t" + contract2.getCustomerShortName();
            stringList.add(str);
        }
        //            //数据处理
        //            Map<Integer, ContractData> map = new LinkedHashMap<>();
        //            for (ContractData contractData : dataList) {
        //                Integer caId = contractData.getContractAgreementId();
        //                ContractData data = map.get(caId);
        //                if (data != null && data.getEndDate().compareTo(contractData.getEndDate()) > 0) {
        //                    contractData = data;
        //                }
        //                map.put(caId, contractData);
        //            }
        //
        //            //拼写sql语句
        //            List<String> updateList = new ArrayList<>();
        //            int i = 0;
        //            for (ContractData contractData : map.values()) {
        //                //如果合同的到期日期与合同服务项中的结束日期差为1
        //                int duration = Months.monthsBetween(contractData.getEndDate(), contractData.getExpireDate()).getMonths();
        //                if (duration == 1) {
        //                    DateTime newEndDate = contractData.getEndDate().plusMonths(1);
        //                    String contractUpdate = "update am_cm_contract set amount=amount+" + contractData.getPriceAmount() + " where id=" + contractData.getContractId() + ";\n";
        //                    String priceUpdate = contractUpdate + "update am_cm_agreement_charge set end_date=\'" + newEndDate.toString(DATE_FORMAT) + "\' where id=" + contractData.getPriceId();
        //                    updateList.add(priceUpdate);
        //                    i++;
        //                }
        //
        //            }
        //
        //            System.out.println("此次修复数据数量为   " + i);
        //            total += i;
        String updateString = stringList.toString().replaceAll("\\[|\\]", "").replace(", ", "\n");
        updateString = updateString + ";";
        File fileOut = new File("/home/c/Documents/datafix/datafix2.sql");
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

        //
        //
        //        System.out.println("总共" + total + "条");
    }
}
