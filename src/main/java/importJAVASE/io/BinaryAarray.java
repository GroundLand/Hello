package importJAVASE.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
public class BinaryAarray {
    public static void main(String[] args) throws IOException {
        DataOutputStream oos = new DataOutputStream(new FileOutputStream(new File("F://cl/io.txt")));
        DataInputStream ois = new DataInputStream(new FileInputStream(new File("F://cl/io.txt")));

        oos.writeUTF("jjj");
        oos.close();
        System.out.println(ois.readByte());
        ois.close();
    }
}