package importJAVASE.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("([a-z]+)(\\d+)");
        Matcher m = p.matcher("aaa2223bb");
        while (m.find()) {
            System.out.println(m.start(2));
        }
    }
}
