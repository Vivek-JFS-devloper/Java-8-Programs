package com.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Join {

    public static void main(String[] args) {
        //Predicate Joining
        // and() or{} method

        //Q.1 Print emps name who one working in noida location in Developer Team 
        Employee e1 = new Employee("Ramesh Paswan", "Noida", "Developer");
        Employee e2 = new Employee("Prashant Paswan", "Gurgoan", "Developer");
        Employee e3 = new Employee("Shakher Paswan", "Noida", "Quality");
        Employee e4 = new Employee("Ravi Ranjan", "Chandigard", "HR");
        Employee e5 = new Employee("Vivek Kumar", "Delhi", "Production");

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);

        Predicate<Employee> p1 = (e) -> e.name.charAt(0) == 'R';
        Predicate<Employee> p2 = (e) -> e.location.equals("Chandigard");
        Predicate<Employee> p3 = (e) -> e.department.equals("HR");

        Predicate<Employee> e = p1.and(p2).and(p3);

        for (Employee emp : employees) {
            if (e.test(emp)) {
                System.out.println("Get Employee Name\t" + emp.getName());
            }
        }
    }

}

class Employee {

    String name;
    String location;
    String department;

    public Employee(String name, String location, String department) {
        this.name = name;
        this.location = location;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDepartment() {
        return department;
    }

}
