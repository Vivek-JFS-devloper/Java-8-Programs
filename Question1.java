package com.collsStreamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question1 {

    public static void main(String[] args) {
        System.err.println("Collection with Stream Questions ?");
        Persion p1 = new Persion("AA", "Delhi");
        Persion p2 = new Persion("BB", "Noida");
        Persion p3 = new Persion("AA", "Pune");
        List<Persion> list = Arrays.asList(p1, p2, p3);

        list.stream().filter(e -> e.getName().equals("AA")).forEach(t -> System.out.println(t.getName()));
        //or 
        Optional<Persion> firstPersion = list.stream().filter(e -> e.getName().equals("AA")).findFirst();

        if (firstPersion.isPresent()) {
            System.out.println("" + firstPersion.get().getCountry());
        }

        //collect name of persion who are belongs to india and store into name collection
        Persion p4 = new Persion("AA", "India");
        Persion p5 = new Persion("Hello", "America");
        Persion p6 = new Persion("Hai", "India");
        Persion p7 = new Persion("DD", "China");

        list = Arrays.asList(p4, p5, p6, p7);
        //using filter()
        List<Persion> newList = list.stream().filter(city -> city.getCountry().equals("India")).collect(Collectors.toList());
        newList.forEach(details -> System.out.println("Get All Details:- " + details.getName()));
        //using map();

        List<String> newList1 = list.stream().filter(city -> city.getCountry().equals("India")).map(name -> name.getName()).collect(Collectors.toList());
        System.out.println("Wit filter and map()  " + newList1);
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

    public String getCountry() {
        return this.country;
    }

}
