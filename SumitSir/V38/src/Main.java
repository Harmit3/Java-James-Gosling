import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


           Scanner scn=new Scanner(System.in);
           System.out.println("Enter a number to print inverse triangle");
           int num=scn.nextInt();

           for(int i = num; i>=1; i--) {
               for(int j=1;j<=i;j++) {
                   System.out.print("*");
               }
               System.out.println();
           }
    }
}