package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number to print table of that number");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

            for(int j=1;j<=10;j++){
                int ans=num*j;
                System.out.println(num+" * "+j+" = "+ans);
            }


    }
}