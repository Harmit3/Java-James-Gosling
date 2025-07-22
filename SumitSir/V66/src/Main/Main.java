package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number to make an arrow");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();


        int space=num/2;
        int str=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=space;j++){
                if(i==num/2+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            for(int j=1;j<=str;j++){

                    System.out.print("* ");

            }
            if(i<=num/2){
                str++;
            }else{
                str--;
            }

            System.out.println();
        }
    }
}