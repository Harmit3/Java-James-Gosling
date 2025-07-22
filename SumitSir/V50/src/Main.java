import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter a number n to make a pattern");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
              if((i+j)==num+1){
                System.out.print("*");
              }else if(i==j){         //oir you can also write (i+j)==i*2 or j*2 means 1*2,2*2,3*2,4*2,5*2
                 System.out.print("*");
              }else{
                  System.out.print(" ");
                }
            }
            System.out.println();
          }


    }
}