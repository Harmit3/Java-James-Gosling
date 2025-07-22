package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number to make pattern");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        int str=1;
        int space=2*num-3;


        for(int i=1;i<=num;i++){
            int val=1;
            for(int j=1;j<=str;j++){
                System.out.print(val);
                val++;
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            if(i==num){
                str--;
                val--;
            }
            for(int j=1;j<=str;j++){
                val--;
                System.out.print(val);

            }

            str++;
            space-=2;

            System.out.println();


        }

    }
}