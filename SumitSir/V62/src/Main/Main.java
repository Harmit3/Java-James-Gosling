package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number to print table of that number");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();


        int space=num/2;
        int str=1;
        int value=1;

            for(int i=1;i<=num;i++) {

                for(int k=1;k<=space;k++){
                    System.out.print(" ");
                }

                int colValue=value;

                for(int j=1;j<=str;j++){
                    System.out.print(colValue);
                    if(j<=str/2){
                        colValue++;
                    }else{
                        colValue--;
                    }

                }


                if(i<=num/2){
                    space--;
                    str+=2;
                    value++;
                }else{
                    space++;
                    str-=2;
                    value--;

                }
                System.out.println();

            }



    }
}