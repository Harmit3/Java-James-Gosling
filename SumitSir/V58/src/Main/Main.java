package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter a number n to make a pattern");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();



        for(int i=0;i<=num;i++){
            int iCj=1; //it is for nC0 is always 1
            for(int j=0;j<=i;j++){
                System.out.print(iCj+" ");
                int iCjp1=iCj*(i-j)/(j+1);
                iCj=iCjp1;
            }
            System.out.println();
        }

    }
}