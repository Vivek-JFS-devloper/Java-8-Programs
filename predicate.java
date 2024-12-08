package com.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicate {

    public static void main(String[] args) {
        Predicate<Integer> p = i -> i > 10;

        System.out.println(p.test(10));

        String[] names = {"Anushka", "Anupma", "Deepak", "Abhishek"};

        Predicate<String> pp = name -> name.charAt(0) == 'A';

        for (String name : names) {
            if (pp.test(name)) {
                System.out.println("Name " + name);
            }
        }

        //Task 2. Take list of persion and print persion where age is >= 18 using Lambda expresson;
        Persion p1 = new Persion("Ramesh Paswan", 23);
        Persion p2 = new Persion("Abhishek", 25);
        Persion p3 = new Persion("Vivek Kumar", 20);
        Persion p4 = new Persion("Sonu Kumar", 18);

        List<Persion> persions = Arrays.asList(p1, p2, p3, p4);

        Predicate<Persion> pers = age1 -> age1.age >= 18;

        for (Persion age : persions) {
            if (pers.test(age)) {
                System.out.println("Get Persion name and age " + "Name:=>\t" + age.getName() + "  |  Age: =>\t" + age.getAge());
            }
        }
    }
}

class Persion {

    String name;
    int age;

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {

        return this.age;
    }

}
