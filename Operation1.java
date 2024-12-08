package com.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Operation1 {

    public static void main(String[] args) {
        System.out.println("Stream API...");
        List<Integer> list = Arrays.asList(11, 33, 22, 66, 44);

        System.out.println(" " + list);

        Stream<Integer> stream = list.stream();

        stream.filter((integer) -> (integer > 40)).forEach(num -> System.out.println(num));
        //1
        List<String> names = Arrays.asList("Ramesh Paswan", "Vikash Kumar", "Abhishek", "Akshay");

        names.stream().filter(name -> name.charAt(0) == 'A').forEach(e -> System.out.println("Name whose Start with (A) => " + e));
        //get Persion Details whose age >= 20;
        PersionDetails pd1 = new PersionDetails("VivekaNamd", 24);
        PersionDetails pd2 = new PersionDetails("Himanshu", 20);
        PersionDetails pd3 = new PersionDetails("Ramesh Paswan", 24);
        PersionDetails pd4 = new PersionDetails("Manesh", 23);
        PersionDetails pd5 = new PersionDetails("Govind", 20);
        PersionDetails pd6 = new PersionDetails("Avinash", 21);

        List<PersionDetails> persionDetailses = Arrays.asList(pd1, pd2, pd3, pd4, pd5, pd6);

        StringJoiner sj = new StringJoiner(" : ", "Name", ".");

        persionDetailses.stream().filter(details -> details.age >= 20 && details.name.charAt(0) == 'A').forEach(details -> System.out.println("Name: " + details.name + " Age :" + details.age));
    }
}

class PersionDetails {

    String name;
    int age;

    public String getName(String name) {
        return this.name = name;
    }

    public int getAge(int age) {
        return this.age;
    }

    public PersionDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
