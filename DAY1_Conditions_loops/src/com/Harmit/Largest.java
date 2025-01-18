//Program for largest number among 3 numbers given by user

package com.Harmit;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter three numbers for check which is largest");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        //1

//        if(num1>num2 && num1>num3){
//            System.out.println(num1+ " is largest.");
//        }
//        else if(num2>num1 && num2>num3){
//            System.out.println(num2+ " 0is largest.");
//        }
//        else{
//            System.out.println(num3+ " is largest.");
//        }
//


      //2

//      int max=num1;
//      if(num2>max){
//           max=num2;
//
//      }
//      else if(num3>max){
//           max=num3;
//
//      }
//     System.out.println(max);


        //3


        System.out.println(Math.max(num3,Math.max(num1,num2)));

    }
}
