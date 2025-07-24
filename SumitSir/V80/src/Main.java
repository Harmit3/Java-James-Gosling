
//covert any number system into decimal

import java.util.*;


public class Main{

    public static int convert(int num,int base,int base1){
        int sum=0;

        int count=0;
        while(num!=0){
            int rem=num%base1;
            sum=sum+rem*(int) Math.pow(base,count);
           num=num/base1;
           count++;


        }


        return sum;
    }
    public static void main(String[] args) {

         Scanner scn=new Scanner(System.in);
         System.out.println("Enter a number to convert number into any base");
         int num=scn.nextInt();

         System.out.println("Enter a base of above number");
         int base=scn.nextInt();

         System.out.println("Enter a base of above number to convert into that number");
         int base1=scn.nextInt();


         int ans=convert(num,base,base1);
         System.out.println(num+" is in base "+base+" and in base "+base1+" conversion is "+ans+".");
    }
}
