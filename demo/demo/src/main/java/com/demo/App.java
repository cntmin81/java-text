package com.demo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(final String[] args) {
        System.out.println("Hello World!");

        System.out.println(
            Stream.of(1,3,3,5,5)
            .filter(i -> i > 2)
            .map(i -> i * 2)
            .map(i -> "#" + i)
            .collect(Collectors.toList())
        );

        System.out.println(
            Stream.of(1,3,3,5,5)
            .filter(i -> i > 2)
            .map(i -> i * 2)
            .map(i -> "#" + i)
            .collect(Collectors.toSet())
        );

        System.out.println(
            Stream.of(1,3,3,5,5)
            .filter(i -> i > 2)
            .map(i -> i * 2)
            .map(i -> "#" + i)
            .collect(Collectors.joining())
        );

    }
}
