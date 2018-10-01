package importJAVASE.io;

import com.google.common.io.PatternFilenameFilter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 *
 * @author cln
 * @version $Id: CompareTwoFiles.java v 0.1 18-9-30 下午2:12 cln Exp $$
 */
public class CompareTwoFiles {

    public static void main(String args[]) throws IOException {
        File dire = new File("/home/c/Documents/datafix");
        PatternFilenameFilter patternFilenameFilter = new PatternFilenameFilter(Pattern.compile(".*sql"));
        File[] files = dire.listFiles(patternFilenameFilter);
        Set<String> strings = new HashSet<>();
        FileInputStream fis = null;
        for (File file : files) {
            //读取数据
            try {
                fis = new FileInputStream(file);
                InputStreamReader isr = null;
                try {
                    isr = new InputStreamReader(fis);
                    BufferedReader bufferedReader = new BufferedReader(isr);
                    String line;
                    while ((line = bufferedReader.readLine()) != null && !line.equals("")) {

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
}
