package importJAVASE.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cln
 * @version $Id: HandleTest.java v 0.1 18-12-4 下午2:28 cln Exp $$
 */
public class HandleTest {

    public static void main(String args[]) throws IOException {
        File file = new File("/home/c/Documents/datafix/ag.tsv");

        int total = 0;
        FileInputStream fis = null;
        int row = 0;
        Map<String, String> map = new HashMap<>();
        //读取数据
        try {
            fis = new FileInputStream(file);
            InputStreamReader isr = null;
            try {
                isr = new InputStreamReader(fis);
                BufferedReader bufferedReader = new BufferedReader(isr);
                String line;

                while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                    row++;
                    String[] strings = line.split("\t");
                    if (map.get(strings[1]) != null) {
                        total++;
                    }
                    map.put(strings[1], strings[0]);
                }
            } finally {
                isr.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fis.close();
        }

        System.out.println(row + "  " + map.keySet().size());
        System.out.println(total);
    }
}
