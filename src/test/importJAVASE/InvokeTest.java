package importJAVASE;

import java8.Car;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author cl
 * @version $Id: InvokeTest v 0.1 2019-11-20 20:31 cl Exp $$
 */
public class InvokeTest {

    private Object  dameObject;

    private void init(){
        Car car = new Car("red",150000);
        dameObject = car;
    }

    @Test
    public void test1() throws Exception {
        init();

        System.out.println(" get the old price of car:"+getPrice());


        Class<?> paramTypes[] = new Class[1];
        paramTypes[0] = Double.TYPE;
        Object paramValues[] = new Object[1];
        paramValues[0] = Double.valueOf("1000");
        Method method = dameObject.getClass().getMethod("setPrice",paramTypes);
        method.invoke(dameObject,paramValues);
        System.out.println(" set the new price of car successfully-----");


        System.out.println(" get the new price of car:"+getPrice());
    }

    private double getPrice() throws Exception{
        Class<?> getParamTypes[] = new Class[0];
        Class<?> getParamValues[] = new Class[0];
        Method getMethod = dameObject.getClass().getMethod("getPrice",getParamTypes);
        return  (double)getMethod.invoke(dameObject,getParamValues);
    }


}
