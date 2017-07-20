package importJAVASE.test;

/**
 * Created by evel on 2017/7/18.
 */
public class PrivateTest {
    private String key = null;

    public String getKey(){
        key = "123";
        return key;
    }

    public void setKey(String key){
        this.key = key;
    }

    public static void main(String args[]){
        PrivateTest pt = new PrivateTest();
        pt.setKey("456");
        System.out.println(pt.getKey());
    }

}
