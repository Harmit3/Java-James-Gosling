//fibonacci number

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();


        int n1=0;
        int n2=1;

        for(int i=0;i<n;i++){
            System.out.print(n1+"  "); //0,1,1,2,3,5
            int temp=n1+n2;   //temp=1,2,3,5,8
            n1=n2;           //n1=1,1,2,3,5
            n2=temp;        //n2=1,2,3,5,8


        }
    }
}