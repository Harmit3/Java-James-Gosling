import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter a number n to make a pattern");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        int str=(num/2)+1;
        int space=1;
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j<= str; j++) {
                System.out.print('*');
            }
            for (int k = 1; k<= space; k++) {
                System.out.print(' ');
            }
            for (int j = 1; j<= str; j++) {
                System.out.print('*');
            }

            if(i<=num/2){
                str--;
                space+=2;
            }else{
                str++;
                space-=2;
            }

            System.out.println();
        }
    }
}