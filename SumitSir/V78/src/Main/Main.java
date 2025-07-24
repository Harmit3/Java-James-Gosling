//Decimal to any base

package Main;

import java.util.*;

public class Main {

    public static int convert(int num,int base){

        int count=0;
        int sum=0;

        while(num!=0){

            int rem=num%base;
            sum=sum + (int) (rem*Math.pow(10,count));
            count++;
            num=num/base;
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter a number in decimal to convert it in any base number system");
        int num=scn.nextInt();

        System.out.println("Enter a base to convert above number into");
        int base=scn.nextInt();

        int ans=convert(num,base);
        System.out.println(num+ " given in decimal to base "+base+" is "+ans);
    }
}