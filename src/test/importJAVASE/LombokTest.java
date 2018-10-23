package importJAVASE;

import lombok.Cleanup;
import lombok.NonNull;
import lombok.val;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author cln
 * @version $Id: LombokTest.java v 0.1 18-10-23 上午10:56 cln Exp $$
 */
public class LombokTest {

    /**
     * val可以将变量申明是final类型
     */
    @Test
    public void valTest() {
        val i = 3;
        //不能更改
        // i=5;
    }

    /**
     * @NonNull 提供非空检查
     */
    @Test
    public void nonNullTest() {
        try {
            method(null);
        } catch (RuntimeException e) {
            System.out.println("空指针异常");
        }

    }

    private void method(@NonNull String str) {
        System.out.println(str);
    }

    /**
     * @Cleanup 注解能够自动释放资源。 :绝对安全的调用close方法
     */
    @Test
    public void cleanUpTest() throws IOException {
        File file = new File("/home/c/Documents/io1.txt");
        @Cleanup FileInputStream fis = new FileInputStream(file);
        int by;
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }
    }

}
