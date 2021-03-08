package com.company.arrayList;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

    public static void main(String[] args) {
        List<com.company.arrayList.Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Mikheil", "Saakashvili", 5));
        employeeList.add(new Employee("Bidzina", "Ivanishvili", 41));
        employeeList.add(new Employee("Nino", "Burjanadze", 666));
        employeeList.add(new Employee("Ylika", "Garibashvili", 69));

        employeeList.set(1, new Employee("Bidzo", "Ivana", 5));

        //O(n) worst case with this and remove too because you must shift elements.
        employeeList.add(3, new Employee("Vano", "Merabishvili", 21));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        employeeList.forEach(employee -> System.out.println(employee));
        //Same as above line but with array

        for(Employee employee: employeeArray){
            System.out.println(employee);
        }

        //If equals method isn't overriden in Employee class, this is gonna return false
        //Because even though element may contain same properties, these are 2 different instances.
        System.out.println(employeeList.contains(new Employee("Vano", "Merabishvili", 21)));

        System.out.println(employeeList.indexOf(new Employee("Vano", "Merabishvili", 21)));
    }
}
