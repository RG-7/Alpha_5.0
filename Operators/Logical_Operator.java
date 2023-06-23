/*
    3. Logical Operator

    &&      (Logical AND)
        Ans     Statement_1     Statement_2
        ------------------------------------
        T       T               T
        F       T               F
        F       F               T
        F       F               F
    ||      (Logical OR)
        Ans     Statement_1     Statement_2
        ------------------------------------
        T       T               T
        T       T               F
        T       F               T
        F       F               F
    !       (Logical NOT)
        Ans     Statement_1
        -------------------
        T       F          
        F       T        
*/
public class Logical_Operator {
    public static void main(String args[]){
        //  logical AND
        System.out.println( "(3>2) && (5>0) = " + ((3>2) && (5>0)) );
        // logical OR
        System.out.println( "(3>2) || (5>3) = " + ((3>2) || (5<3)));
        // Logical NOT
        System.out.println( "!(5>3) = " + (! (5<3)));
    }
}
