package importJAVASE.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2017/6/8 0008.
 */
public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = br.readLine()) != null)
            sb.append(s);
        br.close();
        return sb.toString();
    }

    public static void main(String args[]) throws IOException {
        System.out.println(read("E://Hello/src/main/java/io/BufferedInputFile.java"));

    }

}
