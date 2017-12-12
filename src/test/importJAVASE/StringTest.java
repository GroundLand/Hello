package importJAVASE;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;

/**
 * Created by evel on 2017/7/24.
 */
public class StringTest {
    public static Logger logger = LoggerFactory.getLogger(StringTest.class);

    @Test
    public void singleTest(){
       // String str = "a";
        byte[]  bytes = {(byte)0x61, (byte)0x62, (byte)0x63};

          //  bytes = str.getBytes("UTF-8");
            System.out.println(bytes);

        String str = "中国";
        printBytes("中国的UNICODE编码：", str.getBytes(Charset.forName("unicode")));
        printBytes("中国的GBK编码：", str.getBytes(Charset.forName("GBK")));
        printBytes("中国的UTF-8编码：", str.getBytes(Charset.forName("UTF-8")));


    }

    public static void printBytes(String title, byte[] data) {
        System.out.println(title);
        for (byte b : data) {
            System.out.print("0x" + toHexString(b) + " ");
        }
        System.out.println();
    }

    public static String toHexString(byte value) {
        String tmp = Integer.toHexString(value & 0xFF);
        if (tmp.length() == 1) {
            tmp = "0" + tmp;
        }

        return tmp.toUpperCase();
    }


}
