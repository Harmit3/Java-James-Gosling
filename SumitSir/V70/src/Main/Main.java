package Main;

import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter a number to print Swastik ");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++) {
                if(i==1){
                    if(j==num || j<=num/2+1) {
                        System.out.print(" *");
                    }else {
                        System.out.print("  ");
                    }

                }

                else if(i<=num/2){
                    if(j==num || j==num/2+1){
                        System.out.print(" *");
                    }
                    else {
                        System.out.print("  ");
                    }
                }

                 else if(i==num/2+1){
                    System.out.print(" *");
                }

                else if(i<num) {
                    if (j == 1 || j == num / 2 + 1) {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }
                }

                else{
                    if (j == 1 || j >= num / 2 + 1) {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }
                }



            }
            System.out.println();
        }
    }
}


