package importJAVASE;

import jodatime.DateUtil;
import org.junit.Test;

import java.util.Date;

/**
 *
 * @author cln
 * @version $Id: DateUtilTest.java v 0.1 18-11-21 下午4:08 cln Exp $$
 */
public class DateUtilTest {
    @Test
    public void testDate() {
        Date date = new Date();
        System.out.println(date);
        DateUtil.plusYearDate(date, 1);
        System.out.println(date);
    }
}
