import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter a number n to make a pattern");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        int space=num-1;
        int str=1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= str; k++) {
                System.out.print("*");
            }

            if((space+i)==num){
                space--;
            }

            System.out.println();
        }



        /*you can also do it this way
        *
        *  for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
              if((i+j)==num+1){
                System.out.print("*");
              }else{
                 System.out.print(" ");
              }
            }
            System.out.println();
          }
        *
        *
        *
        *
        *
        *
        * */

    }
}