/*
    Question 2 : - What will be the output of the followingprograms :
    (ii)public class Test {
            public static void main(String[] args) {
                int x = 200, y = 50, z = 100;
                if(x > y && y > z){
                    System.out.println("Hello");
                }
                if(z > y && z < x){
                    System.out.println("Java");
                }
                if((y+200) < x && (y+150) < z){
                    System.out.println("Hello Java");
                }
            }
        }
    Ans :- Java
 */
public class Question_2 {
    public static void main(String args[]){
        // (ii)
        int x = 200, y = 50, z = 100;
        if(x > y && y > z){
            System.out.println("Hello");
        }
        if(z > y && z < x){
            System.out.println("Java");
         }
        if((y+200) < x && (y+150) < z){
            System.out.println("Hello Java");
        }
    }
}
