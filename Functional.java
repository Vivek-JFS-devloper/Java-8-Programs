package com.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functional {

    public static void main(String[] args) {
        Function<String, Integer> f1 = (name) -> name.length();
        Predicate<String> p = name -> name.length() == 6;
        List<String> list = Arrays.asList("Vivek", "Vikash", "Sonam");

        for (String name : list) {
            if (p.test(name)) {

                System.out.println(name + "\t" + f1.apply(name));
            }
        }

        int len = f1.apply("Ramesh Paswan");
        System.out.println(len);
    }
}
