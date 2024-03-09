package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.streams.pojo.Employee;

public class FilterEx {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();
        arr = intiateData(arr);
        //printResult(arr);
        //find salary greater than 40000
        List<Employee> res1 = arr.stream()
                                    .filter(a-> a.getSalary() > 40000)
                                    .collect(Collectors.toList());    
        //printResult(res1);

        //find the list of emp names whose salary is > 30thousand and names in sorted order
         List<Employee> res2 = arr.stream()
                            .filter(a -> a.getSalary() > 30000)
                            .sorted(Comparator.comparing(Employee::getEmpName))
                            .collect(Collectors.toList());
      //  printResult(res2);
       // Filter employees with salary greater than 30,000 and print names in desc
       List<String> filteredNames = arr.stream()
       .filter(emp -> emp.getSalary() > 30000)
       .map(Employee::getEmpName)
       .sorted(Comparator.reverseOrder())
       .collect(Collectors.toList());
       System.out.println(filteredNames);
    }
    
    public static void printResult(List<Employee> arr){
        arr.stream().map(a->a.toString()).forEach(System.out::println);
    }
    public static ArrayList<Employee> intiateData(ArrayList<Employee> arr){
        Employee e1 = new Employee(1,"mahesh",12000,34,23);
        Employee e3 = new Employee(3,"priya",12000,34,23);
        Employee e4 = new Employee(2,"naresh",34650,45,45);
        Employee e2 = new Employee(4,"kumar",34000,4,45);
        Employee e5 = new Employee(5,"nesha",34550,5,75);
        Employee e6 = new Employee(6,"kaju",54556,25,45);
      
        arr = new ArrayList<>();
        arr.add(e1);
        arr.add(e2);
        arr.add(e3);
        arr.add(e4);
        arr.add(e5);
        arr.add(e6);
        return arr;
    }
}
