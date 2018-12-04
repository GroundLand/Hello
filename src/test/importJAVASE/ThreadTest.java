package importJAVASE;

import edu.princeton.cs.algs4.StdOut;
import importJAVASE.algorithms_lintcode.codewars.LongestConsec;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ThreadTest {

    /**
     * 测试TimeUnit
     */
    @Test
    public void timeUnit() {
        StdOut.println(TimeUnit.DAYS.convert(48, TimeUnit.HOURS));
    }

    /**
     * 测试TimeUnit
     */
    @Test
    public void time() {
        System.out.println("longestConsec Fixed Tests");
        //        assertEquals(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
        //        assertEquals(LongestConsec.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
        //        assertEquals(LongestConsec.longestConsec(new String[] {}, 3), "");
        //        assertEquals(LongestConsec.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        assertEquals(LongestConsec.longestConsec(new String[] { "wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu" }, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
        assertEquals(LongestConsec.longestConsec(new String[] { "zone", "abigail", "theta", "form", "libe", "zas" }, -2), "");
        assertEquals(LongestConsec.longestConsec(new String[] { "it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz" }, 3), "ixoyx3452zzzzzzzzzzzz");
        assertEquals(LongestConsec.longestConsec(new String[] { "it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz" }, 15), "");
        assertEquals(LongestConsec.longestConsec(new String[] { "it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz" }, 0), "");

    }

}
