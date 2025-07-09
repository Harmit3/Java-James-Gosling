
//inverse a number question

/*  What is inverse??
*
*  for eg:-  2143   -----> 4 digit number means number made by 1,2,3,4 and ni digit should repeat
*                  4th position->2                    2nd postion--->4
*                  3rd position->1                    1st psotion--->3     //3412 and reverse it so 2143
*                  2nd position->4                    4th psotion--->2
*                  1st position->3                    3rd psotion--->1
*
*  So, inverse of 2143 is    ------------------------------^                 -> 2143
*
*
*
* 15234 -> 5 digit (1 to 5) and no repeatation
*                  5th position->1                    1st postion---`>5
*                  4th position->5                    5th postion--->4
*                  3rd position->2                    2nd psotion--->3     //53214 and reverse it so 41235
*                  2nd position->3                    3rd psotion--->2
*                  1st position->4                    4th psotion--->1
*
*  */

import java.util.*;

public class Main {
    public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter a number to check it's inverse");
              int num=sc.nextInt();
              int position=0;
              int inverseNumber=0;

        while (num != 0) {
            int rem=num%10;  //3  5   4   1   2
            ++position;     //1   2   3   4   5
            int div= (int) Math.pow(10,rem-1);  //100  10000  1000  1  10
            inverseNumber+=(div*position);          //100+20000+3000+4+50=23154
            num=num/10;       //2145  214  21  2 0
        }

        System.out.println(inverseNumber);
    }
}