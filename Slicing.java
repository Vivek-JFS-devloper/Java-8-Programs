package com.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Slicing {

    public static void main(String[] args) {
        List<String> name = Arrays.asList("Ramesh Paswan", "Vivek Kumar", "Vivek Kumar", "a", "b", "a");

        name.stream().forEach(e -> System.out.println(e));
        System.out.println("---------------------");
        name.stream().limit(4).forEach(e -> System.out.println(e));
        name.stream().skip(2).forEach(e -> System.err.println("Skip(2) " + e));
        name.stream().distinct().forEach(e -> System.out.println("distinct()" + e));
        System.out.println("Maching Operations with Stream()");

        Persion p1 = new Persion("Vivek", "India");
        Persion p2 = new Persion("Ramesh ", "Delhi");
        Persion p3 = new Persion("AB", "Gurgaon");

        List<Persion> list = Arrays.asList(p1, p2, p3);

        boolean status = list.stream().allMatch((persion) -> persion.getName().equals("Ramesh Paswan"));
        System.out.println("allMatch() " + status);//all maching
        System.out.println("anyMatch() " + list.stream().anyMatch(p -> p.getName().equals("AB")));
        System.out.println("noneMatch() " + list.stream().noneMatch(p -> p.getName().equals("Ramesh Paswan")));
    }
}

class Persion {

    private String name;
    private String country;

    public Persion(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return this.name;
    }

    public String getCountries() {
        return this.country;
    }
}
