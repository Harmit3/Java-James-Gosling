//Program for if entered character is uppercase or lowercase

package com.Harmit;

import java.util.Scanner;

public class Upper_or_Lower_Case {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch=input.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Please add an character");
        }


    }
}
