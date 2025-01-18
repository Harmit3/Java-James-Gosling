//Program for Reverse the user input number

package com.Harmit;

import java.util.Scanner;

public class ReversetheInteger {
    public static void main(String[] args) {
        int num=1234567;
        int ans=0;
        while(num!=0){
            int rem=num%10;
            num=num/10;
            ans=ans*10+rem;
        }
        System.out.println("Reverse num is "+ans);
    }
}
//       Scanner in=new Scanner(System.in);
//        System.out.println("Enter the number to reverse it");
//        int num=23597;
//        int printNum=num;
//        int reverseNum=0;
//        int temp=0;
//        while(num!=0){
//            for(int i=0;i<5;i++){
//                int num1=num%10;
//                reverseNum=num1+10*temp;
//            }
//            num=num/10;
//            temp=reverseNum;
//        }
//        System.out.println("Given num is "+printNum+" and reverse of it is "+reverseNum);
//    }
//}
