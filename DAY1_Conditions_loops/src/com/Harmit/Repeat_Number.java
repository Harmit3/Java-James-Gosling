//Program for how many times number repeated in integer
//for eg:-  1385757879  has 3 times 7 repeated

package com.Harmit;

import java.util.Scanner;

public class Repeat_Number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=in.nextInt();

        System.out.println("Which repeated number are you looking for");
        int repeated=in.nextInt();

        int count=0;

        while(num!=0){
            if((num%10)==repeated){
                count++;
            }
            num=num/10;
        }

        System.out.println("Number "+ repeated +" is repeated "+count+" times");
    }
}


