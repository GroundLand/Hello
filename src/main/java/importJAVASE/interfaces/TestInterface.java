package importJAVASE.interfaces;

public class TestInterface {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        a.recieveD(a1.getD());
    }
}
