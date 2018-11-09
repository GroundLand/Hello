package importJAVASE;

import com.google.common.collect.Lists;
import importJAVASE.algorithms_lintcode.codewars.JadenCase;
import importJAVASE.annotation.A;
import importJAVASE.annotation.B;
import importJAVASE.annotation.InheritedAnnotation;
import importJAVASE.annotation.C;
import importJAVASE.proxy.Calculate;
import importJAVASE.proxy.CalculatorHandler;
import importJAVASE.proxy.CalculatorImpl;
import org.joda.time.DateTime;
import org.joda.time.Months;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by evel on 2017/7/26.
 */
public class SingleTest {
    final String[] strings = new String[4];
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test() {
        Integer t = 1;
        Integer oldT = 2;
        logger.info("Temperature set to {}. Old temperature was {}.", t, oldT);

    }

    @Test
    public void floatTest() {
        logger.info("3*0.1 == 0.3 result is {}", 3 * 0.1 == 0.3);
    }

    @Test
    public void proxyTest() {
        CalculatorImpl calculator = new CalculatorImpl();
        consumer(calculator);
        Calculate proxy = (Calculate) Proxy.newProxyInstance(
                Calculate.class.getClassLoader(),
                new Class[] { Calculate.class },
                new CalculatorHandler(calculator));
        consumer(proxy);
    }

    public void consumer(Calculate calculate) {
        calculate.doSomething();
        calculate.somethingElse("banana");
    }

    @Test
    public void test1() {
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
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal bigDecimal1 = new BigDecimal(0.00);
        System.out.println(bigDecimal.equals(bigDecimal1));
        BigDecimal decimal1 = new BigDecimal("9.33");
        decimal1.add(null);
        System.out.println(new BigDecimal(2).multiply(decimal1));
    }

    @Test
    public void test3() {
        Date date1 = new DateTime(2019, 9, 1, 0, 0).toDate();
        Date date2 = new DateTime(2018, 9, 1, 0, 0).toDate();
        Date date3 = new DateTime(2020, 9, 1, 0, 0).toDate();
        Date date4 = new DateTime(2016, 9, 1, 0, 0).toDate();

        List<Date> list = Lists.newArrayList(date1, date2, date3, date4);
        Collections.reverse(list);
        Iterator<Date> iterator = list.iterator();
        int i = list.indexOf(date2);
        System.out.print(new DateTime().toString("yyyyMM"));

        Calendar calendar = Calendar.getInstance();
        calendar.set(1995, 8, 16);
        System.out.println(calendar.toInstant());

        //Collections.reverse()只负责转换顺序
        List<Integer> intList = Lists.newArrayList(3, 2, 4, 1);
        intList.subList(1, intList.size()).clear();
        //        Collections.sort(intList);
        //        Collections.reverse(intList);
        System.out.println(intList);
    }

    @Test
    public void testDateTime() {
        DateTime dateTime = new DateTime(2016, 1, 1, 0, 0);

        DateTime dateTime2 = new DateTime(2017, 1, 1, 0, 0);
        System.out.println("开始日期-----" + dateTime2);
        System.out.println("结束日期-----" + dateTime.withMonthOfYear(7));

        int months = Months.monthsBetween(dateTime, dateTime2).getMonths();
        System.out.println(months);
        for (int i = 0; i <= months; i++) {
            System.out.println(dateTime.plusMonths(i));
        }
        //  Months.monthsBetween(dateTime,dateTime2);
        dates(new Date());
        dates(new Date(5, 5, 3));
    }

    private void dates(Date date) {
        System.out.println("344444" + new DateTime(date).toString());
    }

    @Test
    public void anatationTest1() {
        List<Integer> integers = new ArrayList<>();
        integers.add(null);
        integers.add(null);
        System.out.print(CollectionUtils.isEmpty(integers));
    }

}
