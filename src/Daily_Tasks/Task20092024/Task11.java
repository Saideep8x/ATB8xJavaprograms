package Daily_Tasks.Task20092024;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        System.out.println("Enter the value of c");
        c=sc.nextInt();
        int max=a>b?a>c?a:c :(b>c)?b:c;
        System.out.println("The maximum of three numbers is:"+max);
    }
}
