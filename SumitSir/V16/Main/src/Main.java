import java.util.*;

//how many digits are in any number entered by user
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to count it's digit");
        int num=in.nextInt();

        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }

        System.out.println("Digit is "+count);

    }
}