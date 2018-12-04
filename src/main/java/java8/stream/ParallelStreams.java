package java8.stream;

import java8.ForkJoinSumCalculator;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @Fuction 并行流
 */
public class ParallelStreams {

    /**
     * @param n
     * @return 返回从1到给定的所有数字的和
     */
    public static long sequentialSum(long n) {
        //iterate生成的是装箱的对象
        return Stream.iterate(1L, i -> i + 1).limit(n).reduce(0L, Long::sum);
    }

    /**
     *
     * @param n
     * @return 返回从1到给定的所有数字的和, 顺序流转换为并行流
     */
    public static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(0L, Long::sum);
    }

    /**
     *
     * @param n
     * @return 返回从1到给定的所有数字的和, 传统的java模式
     */
    public static long iterativeSum(long n) {
        long result = 0;
        for (long i = 1L; i <= n; i++) {
            result += i;
        }
        return result;
    }

    /**
     *
     * @param n
     * @return 返回从1到给定的所有数字的和, 传统的java模式
     */
    public static long rangedSum(long n) {
        return LongStream.rangeClosed(1, n).sum();
    }

    /**
     *
     * @param n
     * @return 返回从1到给定的所有数字的和, 传统的java模式
     */
    public static long parallelRangedSum(long n) {
        return LongStream.rangeClosed(1, n).parallel().sum();
    }

    /**
     * 分支合并框架
     */
    public static long forkJoinSum(long n) {
        long[] numbers = LongStream.rangeClosed(1, n).toArray();
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        return new ForkJoinPool().invoke(task);
    }

}
