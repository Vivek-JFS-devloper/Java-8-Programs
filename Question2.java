package com.collsStreamQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question2 {

    public static void main(String[] args) {
        System.err.println("Collections and collector Using get Max Min and Average sallary");

        Employee e1 = new Employee(1, "AA", 40000);
        Employee e2 = new Employee(2, "BB", 30000);
        Employee e3 = new Employee(3, "AA", 45000);
        Employee e4 = new Employee(4, "WW", 48000);
        Employee e5 = new Employee(5, "UU", 49000);
        Employee e6 = new Employee(6, "TT", 100000);

        List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6);

        Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.getSallary())));

        System.out.println("Max Employee Sallary Name " + max.get().getName() + "  | Sallary:-  " + max.get().getSallary());

        Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.getSallary())));
        System.out.println("Min Employee Sallary Name " + min.get().getName() + "  | Sallary:-  " + min.get().getSallary());

        double agerageSallary = list.stream().collect(Collectors.averagingDouble(e -> e.getSallary()));

        System.err.println("agerabe Sallary " + agerageSallary);
    }
}

class Employee {

    private int id;
    private String name;
    private double sallary;

    public Employee(int id, String name, double dallary) {
        this.id = id;
        this.name = name;
        this.sallary = dallary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSallary() {
        return this.sallary;
    }
}
