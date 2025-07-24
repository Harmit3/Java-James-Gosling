//any base to any base

//u can convert decimal to anything or anything to decimal.(nut not octal to binary so first convert into binary->decimal and decimal->octal)
import java.util.*;


public class Main{
    //get value in decimal
    public static int convertintodecimal(int num,int base){
        int sum=0;
        int count=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+rem*(int) Math.pow(base,count);
            num=num/10;
            count++;
        }
        return sum;
    }
    //get value in decimal to anybase
    public static int convertintoanybase(int num,int base){
        int sum=0;
        int count=0;
        while(num!=0){
            int rem=num%base;
            sum=sum+rem*(int) Math.pow(10,count);
            num=num/base;
            count++;
        }
        return sum;
    }

    public static int getValue(int num,int base,int base1){
        int decimal=convertintodecimal(num, base);
        int final_num=convertintoanybase(decimal,base1);
        return final_num;

    }
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number to convert number into any base");
        int num=scn.nextInt();

        System.out.println("Enter a base of above number");
        int base=scn.nextInt();

        System.out.println("Enter a base of above number to convert into that number");
        int base1=scn.nextInt();

        int decimal=getValue(num,base,base1);
        System.out.println(decimal);
    }
}
