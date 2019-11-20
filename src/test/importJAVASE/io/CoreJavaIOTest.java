package importJAVASE.io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
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

    public static final String PATH2 = USER_HOME + "/workspace/demo/article.txt";


    public static final String UTF_8 = StandardCharsets.UTF_8.toString();

    /**
     * 获取系统参数
     */
    @Test
    public void getSystemProperty() {
        String home = System.getProperty("catalina.home");
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

    @Test
    public void fileTest() throws IOException{

        String userDir = System.getProperty("user.dir");
        System.out.println("userDir       : "+userDir);
        System.out.println("CanonicalPath : "+new File(userDir).getCanonicalPath());
        System.out.println("返回上一层 : "+new File(userDir,"..").getCanonicalPath());

    }

    @Test
    public void randomFileTest() throws IOException{

        InputStream inputStream = new FileInputStream(PATH2);

        int length = inputStream.available();
        System.out.println(length);
        RandomAccessFile randomFile = new RandomAccessFile(PATH2,"r");
        System.out.println("非i".getBytes(StandardCharsets.ISO_8859_1).length);
        System.out.println("非i".getBytes(StandardCharsets.UTF_8).length);
        System.out.println(randomFile.readLine());
        inputStream.close();
        randomFile.close();
    }

    @Test
    public void classLoader(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader.toString());
    }
}
