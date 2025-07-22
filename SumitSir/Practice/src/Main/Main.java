package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter a number to print arrow");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int space = 0;
        int str = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=str; j++) {
                System.out.print("* ");
            }


            str--;
            space++;

            System.out.println();
        }
    }



}
