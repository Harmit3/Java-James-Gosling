package Main;

import java.util.*;
import java.lang.*;

public class String1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name ");
        String name=in.next();
        String name1=myGreet(name);
        System.out.println(name1);

    }

    static java.lang.String myGreet(String name){
        String message="Hello "+name;
        return message;
    }
}
