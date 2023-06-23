/*
Type converion / implicit conversion / widenning conversion
Ans :-
*/
public class Program_9 {
    public static void main(String args[]){
        // This will be a perfect type conversion
        int a = 25;
        long b =a;
        // This will through an error.
        /*
        long a = 25;
        int b = a;
        */
        System.out.println(b);

    }
}
