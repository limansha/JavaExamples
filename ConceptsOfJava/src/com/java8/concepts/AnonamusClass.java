package com.java8.concepts;

class AnonamusClass{
      public static void main(String[] args) {
        A a = new A(){//if there is a class B whose whole purpose is to override (B extends A) show then we use annamus class
            public void show(){
                  System.out.println("in main A");
            }
        };
        a.show();
      }  
}
class A{
      public void show(){
            System.out.println("in A");
      }
}

