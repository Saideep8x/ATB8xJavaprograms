package Daily_Tasks.Task16092024;

public class Task06 {
    public static void main(String[] args) {

    /*
    1. Difference between = and == operator
    A. '=' is a assignment operator. = operator in java is used to assign value to an variable.
          Example: int a=10;

       '==' it is a comparison operator. It checks two values are equal or not.
          Example:  a==2

     2. byte b = 10; long l = 10l; → How much Byte will be used.
     A. Byte uses 1 byte. (8bit signed integer)
        Long uses 8 bytes. (64bit signed integer)
        Total=9bytes

     3. Another byte b = 10; byte c = 10;  What is the anwser if the perform b+c,
        What is the data type it will give in result.
     A. When we add two byte values java automatically converts the result into int datatype.
        So, the result of b+c will be int.

     4.   short s = 10;

        char c = 'A'; //65

        int ss = s+c;

        System.out.println(ss);
*/
        short s=10;
        char c='A';//ASCII value of A is 65
        int ss=s+c;
        System.out.println("The value of ss is: "+ss);//Answer is 75

    }
}
