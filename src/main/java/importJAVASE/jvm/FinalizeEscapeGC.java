package importJAVASE.jvm;

import java.util.concurrent.TimeUnit;

public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive() {
        System.out.println("yes,I am still alive:)");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws Throwable {
        SAVE_HOOK = new FinalizeEscapeGC();

        SAVE_HOOK = null;

        //第一次成功拯救自己
        System.gc();

        //finalize()方法优先级低
        TimeUnit.SECONDS.sleep(5); //sleep()不释放对象锁，cpu时间分配给其他线程
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no,I am dead");
        }

        SAVE_HOOK = null;

        //自救失败
        System.gc();

        //finalize()方法优先级低
        TimeUnit.SECONDS.sleep(5); //sleep()不释放对象锁，cpu时间分配给其他线程
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no,I am dead");
        }
    }
}
