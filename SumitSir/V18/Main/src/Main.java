import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in=new Scanner(System.in);

        int num=in.nextInt();

        int count=0;
        int temp=num;
        while(temp>0){
           temp=temp/10;
           count++;
        }             //get digits here-----> for eg:- 3
        System.out.println("Digits are "+count);



        int div=(int)Math.pow(10,count-1);     //here, 10^2 is 100.000 so make it 100 so did (int)
       while(div!=0){
           int now=num;                      // 754               54              4
           now=now/div;                     // 754/100=7          5               4
           System.out.println(now);        // 7                   5               4
           num=num%div;                   // 54                   4               0
           div=div/10;                   //  2                    1               0
       }


    }
}