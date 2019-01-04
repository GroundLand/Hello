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
 * @version $Id: DataFix5 v 0.1 2019-01-04 11:04 cl Exp $$
 */
public class DataFix5 {
    public static void main(String[] args) throws Exception{
        File file = new File("/Users/cl/Documents/300224");
        List<String> list = new ArrayList<>();
        @Cleanup FileInputStream fis = new FileInputStream(file);
        @Cleanup InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bufferedReader = new BufferedReader(isr);
        String line;
        while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
            list.add(line+",");
        }
        File fileOut = new File("/Users/cl/Documents/300224");
        @Cleanup FileOutputStream fos = new FileOutputStream(fileOut);
        @Cleanup OutputStreamWriter osw = new OutputStreamWriter(fos);
        for (String sql : list) {
            osw.write(sql);
        }
    }
}
