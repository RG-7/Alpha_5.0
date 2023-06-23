/*
    Question 3 : - What will be the output of the followingprograms :
    (iii)public class Test {
            public static void main(String[] args){
                int x, y, z;
                x = y = z = 2;
                x += y;y -= z;
                z /= (x + y);
                System.out.println(x + " " + y + " " + z);
            }
        }
    Ans :- x = 4 , y = 0 , z = 0
 */
public class Question_3 {
    public static void main(String args[]){
        int x, y, z;
        x = y = z = 2;
        x += y;// x=4, y=2
        y -= z; // y=0, z=2
        z /= (x + y); // z = 0
        System.out.println(x + " " + y + " " + z); // 4 , 0 , 0
    }
}
