package com.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ConsumerFunction {

    public static void main(String[] args) {
        //Consumer<String> name = (c) -> System.err.println("name\t" + c);

        //name.accept("Ramesh Paswan");
        List<String> list = Arrays.asList(
                "Ramesh Paswan", "Vivke Kumar", "Bhim Shen", "Abhishek"
        );
        Predicate<String> p = i -> i.charAt(0) == 'R';

        list.forEach(i -> System.out.println("Print Name\t" + i));

    }
}
