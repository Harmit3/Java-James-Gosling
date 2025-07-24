import java.util.*;

public class Main {

    public static int digitTRepeat(int num,int digit){

        int count=0;
        while(num!=0){
            int rem=num%10;
            if(rem==digit){
                count++;
            }
            num=num/10;
        }

       return count;
    }

    public static void main(String[] args) {
           Scanner scn=new Scanner(System.in);

           System.out.println("Enter a number to check how many times any digit is repeated");
           int num=scn.nextInt();

           System.out.println("Enter a digit to check how many times it is repeated");
           int digit=scn.nextInt();

           int ans=digitTRepeat(num,digit);System.out.println(digit+ " in given num "+num+" is repeated "+ans+" times");
    }
}