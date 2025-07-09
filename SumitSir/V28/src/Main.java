import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the number to find it's prime factorization");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        for(int div=2;div*div<=num;div++){      //optimize by div<=num to div*div<=num by
            // prime property p.q=n and p or q one of that can be >sqrt(n)
            while(num%div==0){
                num=num/div;
                System.out.print(div+" ");
            }
        }

        if(num!=1){
            System.out.print(num);
        }
    }
}