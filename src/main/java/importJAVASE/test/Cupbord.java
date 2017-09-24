package importJAVASE.test;

public class Cupbord {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4=new Bowl(4);
    public Cupbord(){
        System.out.println("Cupbord()");
        bowl4.f1(2);
    }
    public void f3(int marker){
        System.out.println("f3("+marker+")");
    }
}
