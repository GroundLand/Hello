package guava.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;

import java.util.Hashtable;

/**
 * Created by evel on 2017/7/24.
 */
public class StringsTest {
    public static void main(String args[]) {
        System.out.println("取两个字符串相同的前缀  : " + Strings.commonPrefix("wooo", "woooo"));

        System.out.println("在规定长度之内，填补字符串" + Strings.padEnd("xxxf", 6, 'c'));

        System.out.println("如果字符串为空则返回空字符串" + Strings.nullToEmpty(null));

        Hashtable hashtable = new Hashtable();
        hashtable.put(Strings.nullToEmpty(null), "eee");

        System.out.println("--trimFrom()移除开始结尾匹配的字符串" + CharMatcher.is('s').trimFrom("string 3    "));

        System.out.println("--retainFrom(CharSequence)移除匹配不上的字符串" +
                CharMatcher.is('S').retainFrom("  String"));

        System.out.println("--removeFrom(CharSequence)移除匹配上的字符串" +
                CharMatcher.is('S').removeFrom("  StriSng"));
    }
}
