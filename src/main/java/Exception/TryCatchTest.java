package Exception;

/**
 * Created by Administrator on 2017/6/29 0029.
 */
public class TryCatchTest {
    int a=1;
    public static void main(String[] args){
       TryCatchTest obj = new TryCatchTest();
       int i = obj.increment(obj.a);
        System.out.println(i);
    }

    public  int increment(int a){
        try{
            return a++;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return a++;
        }
    }
}
