package java8.stream;

import java.util.function.Function;

public class ConCurrent {
    public static void main(String args[]) {
        ConCurrent conCurrent = new ConCurrent();
        //System.out.println("Sequential sum done in: " + conCurrent.measureSumPert(ParallelStreams::sequentialSum, 10_000_000) + " msecs");
        // System.out.println("parallelSum sum done in: " + conCurrent.measureSumPert(ParallelStreams::parallelSum, 10_000_000) + " msecs");
        System.out.println("iterativeSum sum done in: " + conCurrent.measureSumPert(ParallelStreams::iterativeSum, 10_000_000) + " msecs");
        System.out.println("rangedSum sum done in: " + conCurrent.measureSumPert(ParallelStreams::rangedSum, 10_000_000) + " msecs");
        System.out.println("parallelRangedSum sum done in: " + conCurrent.measureSumPert(ParallelStreams::parallelRangedSum, 10_000_000) + " msecs");
        System.out.println("forkJoinSum sum done in: " + conCurrent.measureSumPert(ParallelStreams::forkJoinSum, 10_000_000) + " msecs");
    }

    public long measureSumPert(Function<Long, Long> adder, long n) {
        long faster = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_100_000;
            if (duration < faster) faster = duration;
        }
        return faster;

    }
}

