package com.Array;

public class PracticeArray {
    public static void main(String[] args) {
        //1-create an array of 5 floats and calculate their sum

      /*  float []marks={18.5f,19.7f,10.3f,30.5f,30.4f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
            System.out.println(sum);

    }
}*/
        //2-check any elemnt present or not
        /*float []marks={18.5f,19.7f,10.3f,30.5f,30.4f};
        float num=30.5f;
        boolean isInArray=false;
        for(float element :marks){
            if(num==element){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("yes present in Array");
        }
else{
            System.out.println("not present in Array");
        }
    }}*/

//3-calculate avarage marks in array counting all students in physics

/*float []marks={18.5f,19.7f,10.3f,30.5f,30.4f};
    float sum=0;
        for(float element:marks){
                sum=sum+element;
                }
                System.out.println("the avarage marks is :" + sum/marks.length);

                }
                }*/

        //4-100 even number print
      /*  int index=0;
        int [] marks = new int[100];
        System.out.println(" even num");
        for (int i=2;i<=200;i++){
            if (i%2==0) {
                marks[index] = i;
                index++;
                System.out.println(i);
            }
        }}}*/
    //add two number
   /*     int[] marks=new int[2];
        marks[0]=100;
        marks[1]=200;
        int sum=0;
        sum=marks[0]+marks[1];
        System.out.println(sum);
    }
}*/

// find maximum in this elemnet
/*int arr[]={12,23,34,45,5,65};
int max=0;
for(int element:arr) {
    if (element > max) {
        max = element;
    }
}
        System.out.println("the value of the maximum element is :"+ max);
    }
}*/

//find minimum in this element
        int [] arr = new int [] {25, 11, 7, 75, 56};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}