/*
    Question 4 : - What will be the output of the followingprograms :
    (iv)public class Test {
            public static void main(String[] args){
                int x = 9, y = 12;
                int a = 2, b = 4, c = 6;
                int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
                System.out.println(exp);
            }
        }
    Ans :- 278
 */
public class Question_4 {
    public static void main(String args[]){
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        System.out.println(exp);
    }
}
