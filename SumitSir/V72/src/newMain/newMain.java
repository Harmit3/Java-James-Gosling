package newMain;

import java.util.*;
public class newMain {
    public static void main(String[] args) {
        System.out.println("Enter a number to print that size of W");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++) {
                if(j==1 || j==num){
                    System.out.print("*");
                }

                else if(i>num/2){
                    if(i==j || i+j==num+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }

                else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
}