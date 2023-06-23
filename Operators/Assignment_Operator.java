/*
    4. Assignment operator
    =   assign 
    +=  add and assign
    -=  subtract and assign
    *=  multiply and assign
    /=  divide and assign    
 */

public class Assignment_Operator {
    public static void main(String args[]){
        // assignment
        int a =5;
        System.out.println("Assign : " + a);
        // add and assign
        System.out.println("Add and assign +=2 = " + (a+=2));
        // sub and assign
        System.out.println("Subtract and assign -=2 = " + (a-=2));
        // divide and assign
        System.out.println("Divide and assign /=2 = " + (a/=2));
        // multipy and assing
        System.out.println("Multiply and assign *=2 = " + (a*=2));
    }
}