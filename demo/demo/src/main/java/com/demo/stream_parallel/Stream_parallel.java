package com.demo.stream_parallel;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Stream_parallel {
    public static void main(String[] args) {
        // System.out.println("\n==========================");
        // System.out.println("stream : ");
        // final Long start = System.currentTimeMillis();
        // Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream().map(i -> {
        // try {
        // TimeUnit.SECONDS.sleep(1);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // return i;
        // })
        // .forEach(i -> System.out.println(i));
        // System.out.println(System.currentTimeMillis() - start);

        System.out.println("\n==========================");
        System.out.println("parallel stream list 8");
        final Long start2 = System.currentTimeMillis();
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).parallelStream().map(i -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return i;
        }).forEach(i -> System.out.println(i));
        System.out.println(System.currentTimeMillis() - start2);

        System.out.println("\n==========================");
        System.out.println("parallel stream list 9");
        final Long start3 = System.currentTimeMillis();
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).parallelStream().map(i -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return i;
        })
        .forEach(i -> System.out.println(i));
        System.out.println(System.currentTimeMillis() - start3);
    }
}
