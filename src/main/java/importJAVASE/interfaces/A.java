package importJAVASE.interfaces;

/**
 * 编程思想
 * 第9章 接口  内部接口
 */
public class A {
    interface B {
        void f();
    }

    public class BImpl implements B {

        @Override
        public void f() {

        }
    }

    public class BImpl2 implements B {

        @Override
        public void f() {

        }
    }

    public interface C {
        void f();
    }

    private interface D {
        void f();
    }

    private class DImpl implements D {
        @Override
        public void f() {

        }
    }

    public class DImpl2 implements D {
        @Override
        public void f() {

        }
    }

    public D getD() {
        return new DImpl2();
    }

    private D dRef;

    public void recieveD(D d) {
        dRef = d;
        dRef.f();
    }
}
