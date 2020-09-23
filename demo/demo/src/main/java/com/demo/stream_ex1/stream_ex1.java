package com.demo.stream_ex1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_ex1 {
    public static void main(final String[] args) {
        System.out.println("count() : " +
            Stream.of(1, 2, 3, 4, 5)
            .filter(i -> i > 3)
            .count());

        System.out.println(".collect(Collectors.toList()) : " +
            Stream.of(1,2,3,4,5)
            .filter(i -> i > 2)
            .filter(i -> i < 5)
            .map(i -> i * 2)
            .filter(i -> i < 8)
            .collect(Collectors.toList())
        );

        System.out.println("collect(Collectors.joining()) : " +
            Stream.of(1,2,3,4,5)
            .filter(i -> i > 3)
            .map(i -> "#" + i)
            .collect(Collectors.joining())
        );

        System.out.println(".collect(Collectors.joining(\",\", \"{\", \"}\")) : " +
            Stream.of(1,2,3,4,5,6)
            .map(i -> "#" + i)
            .collect(Collectors.joining(",", "{", "}"))
        );

        Stream.of(1,2,3,4,5,6)
        .forEach(i -> System.out.print(i + ","));
    }
}
