package importJAVASE.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cln
 * @version $Id: DateFormatUtil.java v 0.1 18-11-5 下午2:31 cln Exp $$
 */
public class DateFormatUtil {

    /** 标准日志格式 */
    public final static String STAND_DATE_PATTERN = "yyyy-MM-dd";

    /** 标准时间格式 */
    public final static String STAND_TIME_PATTERN = "HH:mm:ss";

    private final static SimpleDateFormat STAND_DATE_FOMAT = new SimpleDateFormat(STAND_DATE_PATTERN);

    /**
     * 格式 yyyy-MM-dd HH:mm:ss
     * @param date 被格式化的日期
     * @return 格式化后的日期
     */
    public static String formatOnlyDateTime(Date date) {
        return STAND_DATE_FOMAT.format(date);
    }

}
