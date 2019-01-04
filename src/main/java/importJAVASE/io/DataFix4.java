package importJAVASE.io;

import lombok.Cleanup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cl
 * @version $Id: DataFix4 v 0.1 2019-01-03 16:22 cl Exp $$
 */
public class DataFix4 {
    public static void main(String[] args) throws Exception{
        File file = new File("/Users/cl/Documents/query_result.csv");
        List<String> list = new ArrayList<>();
        @Cleanup FileInputStream fis = new FileInputStream(file);
        @Cleanup InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bufferedReader = new BufferedReader(isr);
        String line;
        while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
            list.add("update am_cm_contract_agreement set available=\'N\' where id = "+line.trim()+";\n");
        }
        File fileOut = new File("/Users/cl/workspace/xdeploy/sql_changed_prod_datafix_manage_20190103xxxxxx.sql");
        @Cleanup FileOutputStream fos = new FileOutputStream(fileOut);
        @Cleanup OutputStreamWriter osw = new OutputStreamWriter(fos);
        for (String sql : list) {
            osw.write(sql);
        }
    }
}
