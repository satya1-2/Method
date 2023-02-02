package com.method;
//problem no 1 to use java method to print multification table of number n
public class PracticeMethodQus {
    static void pattern1(int n){
        for (int i=0;i<n;i++) {
             for (int j = 0; j < i+1; j++) {
            System.out.print("*");
        }
           System.out.println();
        }}
    static void pattern2(int n){
        for (int i=0;i<=n;i++) {
            for (int j = n; j >= i+1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }}

    static void multification(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d*%d = %d\n"  ,n,i,n*i );
        }
    }
    public static void main(String[] args) {

      //multification(5);
       pattern1(4);
        //pattern2(4);

    }
}