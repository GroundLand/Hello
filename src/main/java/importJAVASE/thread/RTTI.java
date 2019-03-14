package importJAVASE.thread;

class Useful {
    public void f() {
    }

    public void g() {
    }
}

class MoreUseful extends Useful {
    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

    public void u() {
    }
}

public class RTTI {
    public static void main(String args[]) {
        Useful[] x = { new Useful(), new MoreUseful() };
        ((MoreUseful) x[0]).u();
        ((MoreUseful) x[1]).u();
    }
}
