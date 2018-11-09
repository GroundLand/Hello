package importJAVASE;

import lombok.Cleanup;
import lombok.NonNull;
import lombok.Paper2;
import lombok.Paper3;
import lombok.SeriPaper;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j(topic = "LombokTest")
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
            log.info("空指针异常");
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

    @Test
    public void serTest() {
        SeriPaper paper = new SeriPaper();

    }

    /**
     * s
     */
    @Test
    public void paper2Test() {
        // Paper2 paper2 = Paper2.of("blue",3.4);

    }

    @Test
    public void paperTest() {
        Paper3 paper3 = new Paper3();
        paper3.setColor("blue");
        paper3.setHeight(2.3);
        paper3.setHeight(4.3);
        System.out.println(paper3);
    }
}
