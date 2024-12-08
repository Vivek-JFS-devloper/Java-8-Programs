package com.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MapStream {

    public static void main(String[] args) {
        System.err.println("Map Stream ");
        List<String> name = Arrays.asList("Ramesh", "Vivke", "Bipin", "Sona");
        //without Stream api
        for (String a : name) {
            System.err.println("Print Name Without Stream Api:- " + a);
        }
        System.out.println("-----------------------------------------");
        name.stream().map(nam -> nam.toUpperCase()).forEach(e -> System.out.println("Print Name Using Stream API:- " + e));
        // Print Employee name with emp age whose sallary is >= 50000 using string api
        Employee e1 = new Employee("A", 20, 50000);
        Employee e2 = new Employee("B", 10, 1000);
        Employee e3 = new Employee("c", 20, 70000);
        Employee e4 = new Employee("D", 20, 50000);
        Employee e5 = new Employee("E", 23, 80000);

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);

        // for (Employee emp : employees) {
        //     if (emp.sallary >= 50000) {
        //         System.err.println("" + emp.name);
        //     }
        // }
        System.out.println("(Print Employe name with emp age whose sallary is >= 5000 using Stream API)");

        employees.stream().filter(e -> e.sallary >= 50000).forEach(details -> System.out.println("Print Name:- " + details.name + " | Age:- " + details.age));

        //flat Map: it is use to flaten list of stream ito sigle stream
        List<List<Employee>> dd = Arrays.asList(employees);
        dd.stream().forEach(d -> System.err.println(d));
        employees.stream().forEach(d -> System.err.println(d));
    }
}

class Employee {

    String name;
    int age;
    double sallary;

    public Employee(String name, int age, double sallary) {
        this.name = name;
        this.age = age;
        this.sallary = sallary;
    }

    public String getName(String name) {
        return this.name;
    }

    public int getAge(int age) {
        return this.age;
    }

    public double getSallary() {
        return this.sallary;
    }

}
