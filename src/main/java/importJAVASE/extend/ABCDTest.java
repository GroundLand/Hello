package importJAVASE.extend;

/**
 * Created by ${Administrator} on ${2017/7/3 0003}
 */
public class ABCDTest {

    public Parent getParent(){
        return new Parent();
    }


    public static void main(String args[]){

       Son son = new Son();
       son.overrideme();
        System.out.println(son.s);
    }

}
