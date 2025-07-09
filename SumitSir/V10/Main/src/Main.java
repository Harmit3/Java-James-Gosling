import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for how many numbers you want to check whether it is prime or not!!");
        int t = input.nextInt();
        int n=input.nextInt();

        if (t < 0) {
            System.out.println("Please enter positive number except 0 & 1.");
        } else if (t == 0 || t == 1) {
            System.out.println("Neither prime nor composite. ");
        } else {
            int count = 2;
            while (count < t) {
                int primeNum = t % count;
                if (primeNum != 0) {
                    count++;
                } else {
                    System.out.println("Not Prime!!");
                    return;
                }
            }
            System.out.println("Prime Number");


        }
    }
}