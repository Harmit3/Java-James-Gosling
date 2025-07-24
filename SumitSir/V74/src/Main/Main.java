package Main;

import java.util.Scanner;

public class Main {



    public static int factorial(int x){
        int ans=1;
        for(int i=1;i<=x;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {

       //how do u write the program for nPr

       //formula of nPr is n!/(n-r)!

       //DRY:- do not repeat yourself and so is function is needed.

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int r=scn.nextInt();

        int factN=factorial(n);
        int factNMR=factorial(n-r);
        int ans=factN/factNMR;
        System.out.println(n+"P"+r+"="+ans);



        /*


        int mulN=1;
        int mulR=1;
        for(int i=1;i<=n;i++){
            mulN=mulN*i;
        }
        for(int i=1;i<=n-r;i++){
            mulR=mulR*i;
        }
        int ans=mulN/mulR;
        System.out.println(n+"P"+r+"="+ans);


         */




    }
}