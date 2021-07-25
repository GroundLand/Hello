package importJAVASE.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description: ThreadPoolExecutor创建线程池
 * @author: cl
 * @date: 2021/07/20 下午8:59
 */
public class ThreadPoolExecutorDemo {

    // 核心线程数量
    private static final int CORE_POOL_SIZE = 5;

    // 最大线程数
    private static final int MAXIMUM_POOL_SIZE = 20;

    // 空闲活跃时间
    private static final long KEEPALIVE_TIME = 1L;

    // 队列容器数量
    private static final int QUEUE_CAPACITY = 100;

    public static void main(String[] args) {


        ThreadPoolExecutor executor = new ThreadPoolExecutor(CORE_POOL_SIZE,
                MAXIMUM_POOL_SIZE,
                KEEPALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy());


        for (int i = 0; i < 20; i++) {

            // 创建任务
            TPERunnable runnable = new TPERunnable(""+i);

            // 执行任务
            executor.execute(runnable);

        }

        // 终止线程
        executor.shutdown();


        do{

        }while (executor.isTerminated());

        System.out.println("All thread finished");
    }


}
