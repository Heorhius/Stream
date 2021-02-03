package main.com.kaptsiug.project.controller;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static final String DEFAULT_OUTPUT_FORMAT = "%d  ";

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 20, 50, 6, 12, 20);

        list.stream().distinct().forEach(x -> System.out.printf(DEFAULT_OUTPUT_FORMAT, x));
        System.out.println("");

        list.stream().filter(x -> x > 10).filter(x -> x < 50).forEach(x -> System.out.printf(DEFAULT_OUTPUT_FORMAT, x));
        System.out.println("");

        list.stream().map(x -> x * 2).forEach(x -> System.out.printf(DEFAULT_OUTPUT_FORMAT, x));
        System.out.println("");

        list.stream().sorted().limit(4).forEach(x -> System.out.printf(DEFAULT_OUTPUT_FORMAT, x));
        System.out.println("");

        System.out.println(list.stream().count());

        System.out.println(list.stream().mapToInt(x -> x).average().getAsDouble());
    }
}
