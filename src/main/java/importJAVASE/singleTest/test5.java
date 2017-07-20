package importJAVASE.singleTest;

/**
 * Created by Administrator on 2017/4/26 0026.
 */
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
public class test5 {

    public static void main(String[] args){
       Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(date);

//        Date starttime = formatter.parse(dateString, pos);
       System.out.print(dateString);
    }


}
