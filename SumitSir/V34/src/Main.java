import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number of bulbs to check weather it is benjamin bulbs are not");
        int num=scn.nextInt();

        for(int i=1;i*i<=num;i++){
            System.out.println(i*i);
        }


    }
}