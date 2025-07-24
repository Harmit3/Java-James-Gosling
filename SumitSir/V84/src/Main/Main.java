package Main;//sum of 2 num. in any base

//u can convert decimal to anything or anything to decimal.(nut not octal to binary so first convert into binary->decimal and decimal->octal)
import java.util.*;


public class Main{
    //get value in decimal
    public static int add(int num1,int num2,int base){
        int sum=0;
        int carry=0;
        int p=1;

        while(num1>0 || num2>0 || carry>0){
            int rem1=num1%10;
            int rem2=num2%10;
            num1=num1/10;
            num2=num2/10;

            int rem=rem1+rem2+carry;
            
            carry=rem/base;
            rem=rem%base;

            sum=sum+rem*p;
            p=p*10;

        }

        return sum;
    }


    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.println("Enter a number1 to do summation");
        int num1=scn.nextInt();

        System.out.println("Enter a number2 to do summation");
        int num2=scn.nextInt();

        System.out.println("Enter a base of above numbers");
        int base=scn.nextInt();

        int add=add(num1,num2,base);
        System.out.println(add);
    }
}
