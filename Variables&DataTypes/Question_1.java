/*
Question 1: In a program,input 3 numbers : A, Band C. You have to output the average of these 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)
Ans:- 
*/
import java.util.Scanner;

public class Question_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/2;
        System.out.println((a+b+c)/2);
        System.out.println(avg);
        sc.close();
    }
}