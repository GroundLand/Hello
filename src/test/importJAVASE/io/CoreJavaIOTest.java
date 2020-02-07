package importJAVASE.io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Properties;

/**
 * @author cl Core Java book Section 2
 * @version $Id: CoreJavaIOTest v 0.1 2019-09-21 17:44 cl Exp $$
 */
public class CoreJavaIOTest {

    private final static String USER_HOME = System.getProperty("user.home");

    public static final String PATH1 = USER_HOME + "/workspace/demo/employee.txt";

    public static final String PATH2 = USER_HOME + "/workspace/demo/article.txt";

    public static final String DATE_PATH = USER_HOME + "/workspace/demo/date.txt";


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

    /**
     * 当两个对象使用同一个对象实例时
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Test
    public void objectStreamTest() throws IOException,ClassNotFoundException{

        Employee harry = new Employee("Harry Hacker",5000,1995,12,12);
        Manager carl = new Manager("Carl Cracker",8000,1987,11,11);
        carl.setEmployee(harry);

        Manager tony = new Manager("Tony Tester",10000,1980,10,11);
        tony.setEmployee(harry);

        Employee[] staff = new Employee[3];

        staff[0] = harry;
        staff[1] = carl;
        staff[2] = tony;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH1))){
            oos.writeObject(staff);

        }

        try (ObjectInputStream ons = new ObjectInputStream(new FileInputStream(PATH1))){
            Employee[] newStaff = (Employee[])ons.readObject();
            for (Employee e: newStaff){
                System.out.println(e);
            }

        }
    }

    /**
     * java.util.Date 会使用自己的writeObject(ObjectOutputStream s)  和 readObject(ObjectInputStream s) 方法writeObject(ObjectOutputStream s)
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Test
    public void dateIOTest() throws IOException,ClassNotFoundException{
        Date date = new Date();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATE_PATH))){
            oos.writeObject(date);

        }

        try (ObjectInputStream ons = new ObjectInputStream(new FileInputStream(DATE_PATH))){
            Date newDate = (Date)ons.readObject();

            System.out.println(newDate);


        }

    }

    @Test
    public void classLoader(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader.toString());
    }
}
