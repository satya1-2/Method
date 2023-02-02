package com.method;

public class MethodConcept {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int c;
        //method invocation using object creation
        //MethodConcept obj=new MethodConcept();
       // c=obj.logic(a,b);
        c=logic(a,b);
         int a1=6;
        int b1=4;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
// calling a method