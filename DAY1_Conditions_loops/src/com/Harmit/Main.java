//Program for if salary>10000 then bonus is 1000 , if lesser then 2000

package com.Harmit;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the income and you will know how much bonus you will get");
        int salary=input.nextInt();
        if(salary>10000){
            System.out.println("Your bonus would be 1000");
        }
        else{
            System.out.println("Your bonus would be 2000");
        }

    }
}
