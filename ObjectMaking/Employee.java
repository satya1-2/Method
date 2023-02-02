package com.ObjectMaking;

public class Employee {
    //properties
    String name;
    int age;
    String address;
    int salary;

    public void performAddition(int num1,int num2){//parameters
        int sum = num1 + num2;
        System.out.println("sum of numbers :" + sum);

    } public void performAddition(int num1,int num2,int num3,String name){//parameters
        int sum = num1 + num2 +num3;
        System.out.println("sum of 3numbers :" + sum+ "enter name"+ name);

    }
    public int useAddition(int num1,int num2)
    {
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Employee emp=new Employee();
        //emp.performAddition(4,6);
       // emp.performAddition(4,6,3,"satya");//arguments
       // System.out.println( emp.useAddition(4,6));//arguments
      int result=emp.useAddition(2,3);
        System.out.println(result);
    }
}
