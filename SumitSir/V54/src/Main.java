import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter a number n to make a pattern");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        int sum=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(sum +' ');
                sum++;
            }
            System.out.println();
        }

    }
}