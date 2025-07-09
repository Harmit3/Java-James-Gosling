import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        //math formula is p.q=n then it can't be possible  that p > root(n) or q > root(n)

        //so we have constraints of 10^9 kinda big number then it will not exceed the time and make a decision in fast calculations

        //for eg:- we have cpu till 3Ghz means it can do 3*10^6 calculation into 1 sec. so if constraints is 10^9 kinda number
        //         and if there are 5 numbers like that it will take 10^18 sec. to iterate and so get time exceed error!!

        //if from, 2 to square root, any number can divide than it is not prime(get count >0)
        // and until 2 to square root, no number can divide (count=0 at sqrt) then prime


        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int count=0;

            for(int div=2;div*div<=n;div++){
                if(n%div==0){
                    count++;

                 /*------>still, there is a catch here if very big num is here and by dividing 2 4 6 ,
                     we realise that it is already prime number so why need to check until it's sqrt. so make your if stment. pre-mature by adding break;
                     if count is going to increase that means that number is divided by 1 and number itself and also any another number that means
                     it is not a prime so break the statement from there, and you're good to go!! */
                  break;
                }
            }

            if(count==0){
                System.out.println("Prime!");
            }
            else{
                System.out.println("Not Prime!!");
            }
        }

    }
}
