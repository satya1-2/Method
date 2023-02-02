package com.method;

public class OverloadingMethod {
    static void foo(){
        System.out.println("good morning bro");
    }
    static void foo(int a){
        System.out.println("good morning " + a + "bro");
    } static void foo(int a,int b){
        System.out.println("good morning " + a + "bro");
        System.out.println("good morning " + b + "bro");
    }

    static void change2(int[]arr) {
        arr[0] = 98;
    }
    static void change(int a){
       a=98;
    }
    static void tellJoke(){
        System.out.println("i invented a new word\n"+ "plogarism");
    }

    public static void main(String[] args) {
        //tellJoke();
        // changing the integer
      /*  int [] marks={52,543,7,89,98,94};
        int x=45;
        change(x);
        System.out.println("the value after running change is : "+ x);
    }
}*/
//changing the array

/*int [] marks={52,45,67,87,9,98};
change2(marks);
        System.out.println("the value after change is : "+marks[0]);}}*/

        // method overloading=two or more method can have same name but different parameters Such method are called overloading methods
       // method overloading can not be perform by changing the return type of method
        // arguments are Actual
        foo();
        foo(3000);
        foo(100,200);
    }}

