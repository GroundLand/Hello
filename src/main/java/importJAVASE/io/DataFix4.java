package importJAVASE.io;

import lombok.Cleanup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author cl
 * @version $Id: DataFix4 v 0.1 2019-01-03 16:22 cl Exp $$
 */
public class DataFix4 {
    public static void main(String[] args) throws Exception{
        File file = new File("/Users/cl/Documents/query_result.csv");
        StringBuilder builder = new StringBuilder();
        @Cleanup FileInputStream fis = new FileInputStream(file);
        @Cleanup InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bufferedReader = new BufferedReader(isr);
        String line;
        while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
            builder.append(line);
            builder.append(",\n");
        }
        File fileOut = new File("/Users/cl/workspace/xdeploy/sql_changed_prod_datafix_manage_20190103xxxxxx.sql");
        @Cleanup FileOutputStream fos = new FileOutputStream(fileOut);
        @Cleanup OutputStreamWriter osw = new OutputStreamWriter(fos);

            osw.write("update am_cm_contract_agreement set available=\'N\' where id in "+"("+builder+");");

    }
}
