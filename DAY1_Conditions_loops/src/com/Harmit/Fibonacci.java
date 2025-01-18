//Program for find nth fibonacci number

package com.Harmit;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("To find nth fibonacci number, please enter the n");
        int n=in.nextInt();


        System.out.println("Enter two numbers:");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int count=1;
        int temp=0;

        while(count!=n){
            temp=num1+num2;
            num1=num2;
            num2=temp;

        count++;
        }

        System.out.println(temp);

    }
}
