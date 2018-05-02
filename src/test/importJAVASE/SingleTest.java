package importJAVASE;

import importJAVASE.proxy.Calculate;
import importJAVASE.proxy.CalculatorHandler;
import importJAVASE.proxy.CalculatorImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;

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

    @Test
    public void proxyTest(){
        CalculatorImpl calculator = new CalculatorImpl();
        consumer(calculator);
        Calculate proxy = (Calculate) Proxy.newProxyInstance(
                Calculate.class.getClassLoader(),
                new Class[]{Calculate.class},
                new CalculatorHandler(calculator));
        consumer(proxy);
    }

    public void consumer(Calculate calculate){
        calculate.doSomething();
        calculate.somethingElse("banana");
    }
}
