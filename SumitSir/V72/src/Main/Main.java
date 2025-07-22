package Main;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number to print that size of W");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1 || j==num){
                    System.out.print(" *");
                }

                else if(i==3){
                    if(j==3){
                        System.out.print(" *");
                    }
                    else{
                        System.out.print("  ");
                    }
                }

                else if(i==4){
                  if(j==2 || j==4){
                     System.out.print(" *");
                   }
                  else{
                      System.out.print("  ");
                  }
                }

                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}