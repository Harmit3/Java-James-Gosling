//GCD----> GREATEST COMMON DIVISOR AND LCM--->LOWEST COMMON DIVISOR

/*  for eg:- 24 and 36
*         :- in 3rd and 4th std. what we use to do to find gcd?
*
*--------> 36/24 --> get q=1 & rem=12  then make 24 divisor and do 24/12 (rem that we got in 1st step)
*                --> 24/12 get q=2 and rem=0, and when we get rem=0 then that divisor is GCD.
*
*
* ------> for LCM, there were one property which was gcd*lcm=n1*n2, so use it lcm=(n1*n2)/gcd.
*
*  */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int num1=sc.nextInt();
        int num2=sc.nextInt();


        int on1=num1;
        int on2=num2;

        while((num1%num2)!=0){
            int rem=num1%num2;
            num1=num2;
            num2=rem;
        }

        int gcd=num2;    //here, you will get num2
        int lcm=(on1*on2)/gcd;    //here,you can't make num1 and num2 because doing while ops., you have't
                                  //     had that value, so it store that num in varible.

        System.out.println("GCD is "+gcd);
        System.out.println("LCM is "+lcm);

    }
}