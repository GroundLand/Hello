package importJAVASE.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by evel on 2018/2/23.
 */
public class CalculatorHandler implements InvocationHandler {
    private Object proxied;
    //private Logger logger = LoggerFactory.getLogger(getClass());

    public CalculatorHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("Invoked class:{" + o.getClass() + "}, start method:{" + method.getName() + "},args:{}");
        if (objects != null) {
            for (Object obj : objects)
                System.out.println(" " + obj);
        }

        return method.invoke(proxied, objects);
    }

}
