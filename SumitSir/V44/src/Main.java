import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number to print triangle");
        int num=scn.nextInt();

        int space=num/2;
        int str=1;
        for(int i = 1; i<=num; i++) {
            for(int j =1; j<=space; j++) {
                System.out.print(" ");
            } for(int k = 1; k<=str; k++) {
                System.out.print('*');
            }


            if(i<=num/2){
                  space--;
                  str+=2;
            }else{
                space++;
                str-=2;
            }
            System.out.println();

        }



    }
}