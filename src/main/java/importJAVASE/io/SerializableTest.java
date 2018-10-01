package importJAVASE.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Administrator on 2017/6/1 0001.
 */
public class SerializableTest {
    public static void main(String[] args) {
        File file = new File("/home/c/Documents/io.txt");
        FileOutputStream fos = null;
        FileInputStream fin = null;
        try {
            fos = new FileOutputStream(file);

            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
            try {
                oos = new ObjectOutputStream(fos);
                Student student = new Student("Alice", 12, 89.6);
                oos.writeObject(student);
                oos.flush();

                fin = new FileInputStream(file);
                ois = new ObjectInputStream(fin);
                Student student1 = (Student) ois.readObject();
                System.out.println(student1);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {

                    oos.close();
                    ois.close();

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
                fin.close();
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
