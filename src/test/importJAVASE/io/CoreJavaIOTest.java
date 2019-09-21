package importJAVASE.io;

import org.junit.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * @author cl Core Java book Section 2
 * @version $Id: CoreJavaIOTest v 0.1 2019-09-21 17:44 cl Exp $$
 */
public class CoreJavaIOTest {

    private final static String USER_HOME = System.getProperty("user.home");

    public static final String PATH1 = USER_HOME + "/workspace/demo/employee.txt";


    public static final String UTF_8 = StandardCharsets.UTF_8.toString();

    /**
     * 获取系统参数
     */
    @Test
    public void getSystemProperty() {
        Properties properties = System.getProperties();
        System.out.println(properties.toString().replace(", ", "\n"));
    }

    @Test
    public void PrintWriterTest() throws IOException {
        PrintWriter out = new PrintWriter(PATH1, UTF_8);
        String name = "cdl";
        double salary = 100;
        out.print(name);
        out.print(" : ");
        out.println(salary);
        //       out.flush();  // 文件被写入
        out.close();
    }

    @Test
    public void simpleReadTxt() throws IOException, URISyntaxException {
        Path path = Paths.get(USER_HOME, "/workspace/demo/employee.txt");

        String content = new String(Files.readAllBytes(path), UTF_8);

        System.out.println(content);
    }
}
