/*
Question 4 : What will be the type of result in thefollowing Java code?
byte b = 4;
char c = 'a';
short s = 512;
int i = 1000;
float f = 3.14f;
double d = 99.999945;

result = ( f * b ) + ( i * c ) - ( d * s ) ;

Ans:-
*/
public class Question_4 {
    public static void main(String args[]){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.999945;

        // since from type promotion in expressions if one operan is among long, float or double it will autmoatically get promoted to the same 
        // so here the greatest is double so all will  be promoted to double
        double result = ( f * b ) + ( i * c ) - ( d * s ) ;
        System.out.println(result);
    }
}
