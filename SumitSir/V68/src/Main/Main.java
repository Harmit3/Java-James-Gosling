package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter a number to print sand time watch");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int str=num;
        int space=0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=str; j++) {
                if(i>1 && i<=num/2 && j>1 && j<str){
                    System.out.print("   ");
                }
                else{
                    System.out.print(" * ");
                }
            }

            if(i<=num/2){
                str-=2;
                space++;
            }else{
                str+=2;
                space--;
            }

            System.out.println();
        }



        }
    }




