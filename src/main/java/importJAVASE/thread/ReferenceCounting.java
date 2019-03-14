package importJAVASE.thread;

/**
 *@author cl
 * 验证一个对象存活多久
 * 方法：引用技术跟踪人际人访问这共享对象的对象数量
 */
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("disposing" + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long couter = 0;
    private final long id = couter++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing" + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = { new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared) };
        for (Composing c : composings) {
            c.dispose();
        }
    }
}
