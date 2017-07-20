package importJAVASE.io;

import java.io.*;

/**
 * Created by Administrator on 2017/6/1 0001.
 */
public class SerializableTest {
    public static void main(String[] args) {
        File file = new File("F:/cl/io.txt");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);

            ObjectOutputStream oos = null;
            try {
                oos = new ObjectOutputStream(fos);
                Student student = new Student("Alice", 12, 89.6);
                oos.writeObject(student);
                oos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {

                    oos.close();


                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("oos关闭失败：" + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件：" + e.getMessage());
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("fos关闭失败：" + e.getMessage());
            }
        }

        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
//            Student student1 = new Student();
//            ObjectInputStream
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
