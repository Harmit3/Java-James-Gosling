import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number to print inverse triangle");
        int num=scn.nextInt();

        for(int i = 1; i<=num; i++) {
            for(int j=num-i;j>=1;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}