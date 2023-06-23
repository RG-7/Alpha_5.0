/*
Question 2 : In a program, input the side of a square. You have to out put the area of the square.
(Hint : area of a square is (side x side))
Ans:-
*/
import java.util.Scanner;

public class Question_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float side = sc.nextFloat();
        float area = side * side;
        System.out.println(area);
        sc.close();
    }
}
