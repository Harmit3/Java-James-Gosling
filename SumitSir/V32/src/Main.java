import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter 3 numbers to check weather it is pythagorus triplets or not!");
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int num3=scn.nextInt();

        int max=num1;

        if(num2>=max){
            max=num2;
        }

        if(num3>=max){
            max=num3;
        }

        if(max==num1){

          /*  if((num1*num1)==((num2*num2)+(num3*num3))){
                System.out.println("True");
            }else{
                System.out.println("False");
            }*/

            //to optimize this

            boolean flag=(((num2*num2)+(num3*num3))==(num1*num1)); //contains true or false
            System.out.println(flag);

        }else if(max==num2){
            boolean flag=(((num1*num1)+(num3*num3))==(num2*num2)); //contains true or false
            System.out.println(flag);
        }else{
            boolean flag=(((num1*num1)+(num2*num2))==(num3*num3)); //contains true or false
            System.out.println(flag);
        }
    }
}