package importJAVASE;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by evel on 2017/7/26.
 */
public class SingleTest {
    final String[] strings = new String[4];
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test() {
        Integer t= 1;
        Integer oldT =2 ;
        logger.info("Temperature set to {}. Old temperature was {}.", t, oldT);

    }
}
