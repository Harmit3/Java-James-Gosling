import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter a number n to make a pattern");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        int outer=num/2;
        int inner=-1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= outer; j++) {
                System.out.print(" ");
            }
            System.out.print('*');
            for (int l = 1; l<=inner; l++) {
                System.out.print(" ");
            }

            if(i>1 && i<num){
                System.out.print('*');
            }

            if(i<=num/2){
                outer--;
                inner+=2;
            }else{
                outer++;
                inner-=2;
            }
            System.out.println();
        }


    }
}