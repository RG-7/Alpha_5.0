/*
imppporting scanner class
Ans:-
*/
import java.util.*;
public class Program_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        //for a full line with space 
        String name = sc.nextLine();
        System.out.println(name);

        //for integer as input
        int number = sc.nextInt(); 
        System.out.println(number);

        //for input float value
        float price = sc.nextFloat();
        System.out.println(price);

        //all types of input are 
        /*
        next();
        nextLine();
        nextInt();
        nextByte();
        nextFloat();
        nextDouble();
        nextBoolean();
        nextShort();
        nextLong();
         */  
        sc.close();      
    }
}
