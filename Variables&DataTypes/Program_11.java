/*
Type Promotion in Expression
Ans:- 
*/
import java.util.Scanner;
public class Program_11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char a ='a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(a);
        System.out.println(b-a);
        System.out.println("**************************************");

        int aa=10;
        float bb = 20.25f;
        long c = 25;
        double d = 30;
        double ans = aa + bb + c + d;
        System.out.println(ans);
        sc.close();
    }
}
