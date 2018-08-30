package importJAVASE;

import importJAVASE.algorithms_lintcode.codewars.JadenCase;
import importJAVASE.proxy.Calculate;
import importJAVASE.proxy.CalculatorHandler;
import importJAVASE.proxy.CalculatorImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

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
    public void floatTest(){
        logger.info("3*0.1 == 0.3 result is {}",3*0.1==0.3);
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

    @Test
    public  void test1() {
        assertEquals(1, JadenCase.rowSumOddNumbers(1));
        assertEquals(8, JadenCase.rowSumOddNumbers(2));
//        assertNull("Must return null when the arg is null", JadenCase.toJadenCase(""));
//        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", JadenCase.toJadenCase("most trees are blue"), "Most Trees Are Blue");

    }

    /**
     * String.valueOf()  vs  Objects.toString()
     */
    @Test
    public void test2() {
        Integer hasValue = 1;
        Integer noValue = null;
        assertEquals("1", String.valueOf(hasValue));
        assertEquals("1", Objects.toString(hasValue));
        assertEquals("null", String.valueOf(noValue));
        Objects.toString(noValue);
    }

}
