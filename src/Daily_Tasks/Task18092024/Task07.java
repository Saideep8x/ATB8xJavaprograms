package Daily_Tasks.Task18092024;
//// Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.
public class Task07 {
    public static void main(String[] args) {

        int a = 100;
        byte b = 10;
        int c = a + b;         // Implicit widening from byte to int
        int a1 = a + (int) b;  // Explicit cast (not needed here, as byte is automatically widened to int)
        System.out.println("Implicit Widening: " + c);
        System.out.println("Explicit Widening: " + a1);

        // Narrowing
        int i = 123;
        double e = 100.99;
        // int f = i + e;    // Error (implicit narrowing not allowed)
        int j = i + (int) e;  // Explicit narrowing from double to int
        System.out.println("Explicit Narrowing: " + j); // 223
    }
}
