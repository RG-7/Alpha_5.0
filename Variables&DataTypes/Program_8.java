/*
area of a circle where inout is from user
Ans;-
*/
import java.util.Scanner;
public class Program_8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14f *radius*radius;
        System.out.println(area);
        sc.close();
    }
}
