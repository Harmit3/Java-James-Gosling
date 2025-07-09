import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to rotate");
        int num=sc.nextInt();
        System.out.println("How many times you want to rotate that number");
        int rotate=sc.nextInt();


            int tempNum=num;
            int count=0;
            while(tempNum>0){
                tempNum=tempNum/10;
                count++;
            }

            rotate=rotate%count;

            if(rotate<0){
                rotate=rotate+count;
            }


            int div=1;
            int mul=1;
            for(int j=1;j<=count;j++){
                if(j<=rotate){
                    div=div*10;
                }
                else{
                    mul=mul*10;
                }
            }

           int rem=num%div;
           int q=num/div;

           int ans=rem*(mul)+q;
         System.out.println(ans);

    }
}
