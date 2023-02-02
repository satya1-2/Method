package com.Array;

public class ArrayConcepts {
    public static void main(String[] args) {
// class of 500 students
        // int marks[]= new int[5];
   /*     int marks[];
               marks=new int[5];
marks[0]=100;
marks[1]=10;
marks[2]=12;
marks[3]=130;
marks[4]=140;
        System.out.println(marks[4]);
    }
}*/
// third type to write array
        System.out.println("print length of array");
        int[] marks = {20, 30, 40, 50, 60};
        System.out.println(marks.length);
       // displaying simple way
        System.out.println("printing using simple way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        //displaying the array (for loop)
        System.out.println("prinring using loop");
        for (int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }
        //reverse order presnt loop
        System.out.println("printing the reverse order");
     for (int i=marks.length-1;i>=0;i--){
         System.out.println(marks[i]);
        }
    // displaying the array for each loop
        System.out.println("displaying for each loop");
     for(int element:marks){
         System.out.println(element);
     }
    }
}