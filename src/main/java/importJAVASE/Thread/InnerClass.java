package importJAVASE.Thread;

public class InnerClass {
    public static void main(String args[]) {
        Runnable runnable1 = new Runnable() {
            int i = 0;

            @Override
            public void run() {
                for (; i < 100; i++) {
                    System.out.println("a__" + i);
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();
    }

}
