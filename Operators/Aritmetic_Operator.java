/*
   1. Arithmetic Operator
        Binary                  Unary
        -----------------------------
        + (Add)                 ++ (Increment)
        - (Subtract)            -- (Decrement)
        * (Multiplication)
        / (Divide)
        % (Moduls)
*/
public class Aritmetic_Operator {
    public static void main(String args[]){
        int A = 10, B = 5;
        System.out.println("Add = "+ (B+A));
        System.out.println("Subtract = "+ (A-B));
        System.out.println("Multiply = "+ (B*A));
        System.out.println("Divide = "+ (B/A));
        System.out.println("Moduls = "+ (B%A));
        System.out.println("A = "+ A +" and after incrementation A = "+ (++A));
        System.out.println("B = "+ B +" and after decrementation B = "+ (--B));
    }
}
