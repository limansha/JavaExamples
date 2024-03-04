package com.java8.concepts;
    
import java.io.*;
import java.util.*;


class Student implements Comparable<Student>{
    int sid;
    String name;

    public Student(int i ,String j){
        sid = i;
        name = j;
    }

    public int compareTo(Student s){
        return this.sid > s.sid ? 1 : -1;
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', sid=" + sid + '}';
    }

}
public class ComparableEx {
    public static void main(String[] args) throws IOException {
        //int []arr = {3,4,5,1,7};
        //when we can't change class defination and when we want to override compareTo method
        Comparator<Integer> c = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i < j) return 1;
                return -1;
            }
        };
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);arr.add(5);arr.add(4);arr.add(5);
        Collections.sort(arr,c);
        System.out.println(arr);
       ArrayList<Student> arr1 = new ArrayList<Student>();
         arr1.add(new Student(1, "dssfd"));
         arr1.add(new Student(3, "dd"));
         Collections.sort(arr1);
        arr1.forEach(System.out::println);
    }
}
