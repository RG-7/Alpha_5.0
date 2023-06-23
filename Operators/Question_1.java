/*
    Question 1 : - What will be the output of the followingprograms :
    (i) public class Test {
            public static void main(String[] args){
                int x = 2, y = 5;
                int exp1 = (x * y / x);
                int exp2 = (x * (y / x));
                System.out.print(exp1 + “ , ”);
                System.out.print(exp2);
            }    
        }
    Ans : - 5,4
 */
public class Question_1 {
    public static void main(String args[]){
        // Answer is in comment
        // (i)
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }
}
