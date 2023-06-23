/*
Question 3 : Enter cost of 3 items from the user (using float data type)-a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
Ans:-
*/

import java.util.Scanner;

public class Question_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // problem simple solution
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total_cost = pen + pencil + eraser;
        System.out.println(total_cost);

        //Advance problem solution
        float gst = (18f/100f)*total_cost;
        float cost_with_gst = gst + total_cost;
        System.out.println(cost_with_gst);

        sc.close();
    }
}
