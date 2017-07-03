package MD5;

import java.security.MessageDigest;

/**
 * Created by Administrator on 2017/6/15 0015.
 */
public class MD5Utils {


    public static void main(String[] args) throws Exception {
        String password = "12345";
        byte[] byteOfMessage = password.getBytes("UTF-8");
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] degist = md.digest(byteOfMessage);
        System.out.print(degist.toString());
    }
}
