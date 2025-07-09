package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter two numbers: ");
       //take the input of two numbers and print the sum
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();


        System.out.println("The sum of two numbers are: "+(a+b));

    }
}