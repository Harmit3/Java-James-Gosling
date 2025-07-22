import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number to print triangle");
        int num=scn.nextInt();

        for(int i = 0; i<num; i++) {

            for(int k=0;k<i;k++) {
                System.out.print(" ");
            }

            for(int j=num-i;j>0;j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}