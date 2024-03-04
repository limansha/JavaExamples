package com.java8.streams.pojo;

public class Employee {
    int empId;
    String empName;
    int salary;
    int noOfCommits;
    int age;
    public Employee(int empId, String empName, int salary, int noOfCommits, int age) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.noOfCommits = noOfCommits;
        this.age = age;
    }
    public int getEmpId() {
        return empId;
    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", noOfCommits="
                + noOfCommits + ", age=" + age + "]";
    }
    public String getEmpName() {
        return empName;
    }
    public int getSalary() {
        return salary;
    }
    public int getNoOfCommits() {
        return noOfCommits;
    }
    public int getAge() {
        return age;
    }
}
