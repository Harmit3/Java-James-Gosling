//rotate a number n entered by user k times

/*
* for eg:-  n=25398  k=2 ----> ans=98253
*
* realize that, 98 (last 2 digit) goes to front and then left digit as it is so 98253
*
* also, how many digit's number can rotation will get the same number sp 25398's 5th rotation is 25398
*
* so,handle the case for -ve and digit >n.
*
* first approach -------->
*               1. whatever the num. is make div. of that if 2 then 10^2(100) and n/100 then rem. is 98.
*               2. make it multiply by 10^3(rem+1------>1000) so 98000
*               3. add quotient left from n/100 and add 98000 in that so you will get the ans
*

*
* */


import java.util.*;

public class Main {
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);

             System.out.println("Enter a number");
             int num=sc.nextInt();

             System.out.println("Enter the rotation time");
             int k=sc.nextInt();


             int temp=num;
             int count=0;
              while(temp>0){
                  temp=temp/10;
                  count++;
              }

              k=k%count;

              if(k<0){
                  k=k+count;
              }

             int div=1;
             int mul=1;

              for(int i=1;i<=count;i++){
                  if(i<=k){
                       div=div*10;
                  }else{
                      mul=mul*10;
                  }
              }

             int q=num/div;  //253
             int r=num%div;   //25398%100 =98



             int rotate=r*mul+q; //98000



              System.out.println(rotate);



        }
    }
