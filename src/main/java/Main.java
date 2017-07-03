import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自动生成的方法存根

        // TODO Auto-generated method stub

        try {

            File file = new File("E:\\javademo/y.txt");

            Scanner input = new Scanner(file);


            while (input.hasNextLine()) {
                String fileName = input.next();
                String mi = input.next();
                String lastName = input.next();

                int y  = input.nextInt();

                System.out.println(fileName +"mi" +"lastName" +"  y");
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
