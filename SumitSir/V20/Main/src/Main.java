//Print a number that user entered in reverse pattern

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number to reverse it");
        int num=sc.nextInt();

        while(num>0){
            int rem=num%10;
            System.out.print(rem);
            num=num/10;
        }



    }
}