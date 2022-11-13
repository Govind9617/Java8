package org.example.streamsapi.streamterminal;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class parallelstream {

    public static long checkPerfoemence(Supplier<Integer> supplier, int numberOfTimes) {
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++) {
            supplier.get();

        }
        long endTime=System.currentTimeMillis();
        return endTime-startTime;
    }

    public static int sum_Sequential_Stream() {
        return IntStream.rangeClosed(1, 1000).sum();
    }

    public static int sum_Parallel_Stream() {
        return IntStream.rangeClosed(1, 1000).parallel().sum();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("sequencel stream " +checkPerfoemence(parallelstream::sum_Sequential_Stream,20));
        System.out.println("parral stream "+checkPerfoemence(parallelstream::sum_Parallel_Stream,20));

    }
}
