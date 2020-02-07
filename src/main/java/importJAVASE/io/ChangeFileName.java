package importJAVASE.io;

import com.google.common.io.PatternFilenameFilter;

import java.io.File;
import java.util.regex.Pattern;

/**
 * @author cln
 * @version $Id: ChangeFileName.java v 0.1 18-9-30 上午9:44 cln Exp $$
 */
public class ChangeFileName {
    public static void main(String args[]) {
        File dire = new File("/home/c/Documents");
        PatternFilenameFilter patternFilenameFilter = new PatternFilenameFilter(Pattern.compile(".*txt"));
        File[] files = dire.listFiles(patternFilenameFilter);
        if (files == null) {
            System.out.println("没有txt结尾的文件");
            return;
        }
        for (File file : files) {

            System.out.println(file.getName());
        }
    }
}
