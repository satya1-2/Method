package com.method;
// you can give any function to more than one arguments
public class Varargs {
   /* static int sum(int a, int b){
        return a+b;
    } static int sum(int a, int b,int c){
        return a+b+c;
    }} */
    static int sum(int ...arr){
        //available as int[]arr;
        int result=0;
        for (int element :arr){
    result +=element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("welcome to varargs");
        System.out.println("the sum of 4 and 6 is :" + sum(4,6));
        System.out.println("the sum of 4,5 and 6 is :" + sum(4,6,5));


    }
}
