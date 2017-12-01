package guava.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;

import java.util.Hashtable;

/**
 * Created by evel on 2017/7/24.
 */
public class StringsTest {
    public static void main(String args[]){
        System.out.println(Strings.commonPrefix("wooo","ww"));

        System.out.println(Strings.padEnd("xxxf",6,'c'));

        System.out.println(Strings.nullToEmpty(null).toString());

        Hashtable hashtable = new Hashtable();
        hashtable.put(Strings.nullToEmpty(null),"eee");

        CharMatcher.breakingWhitespace().trimFrom("dsdf  ::");

    }
}
