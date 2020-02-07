package importJAVASE;



import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos= new FileOutputStream(new File("/Users/cl/Documents/我的.txt"));

        ZipOutputStream zos=new ZipOutputStream(fos);


        // TODO 自动生成的方法存根

        // TODO Auto-generated method stub

        int count = 0;
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            num = num + i;
            count = count++;
        }

        System.out.println(count * num);
    }
}
