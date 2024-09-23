package Daily_Tasks.Task13092024;

import java.util.Scanner;
/*Write a program to print the table of number which user will give( int num 10)
output will be like this (by using the printf()
10 × 1 = 10
        10 × 2 = 20
        10 × 3 = 30….
        10 × 10 = 100.*/
public class Task04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the number");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.printf("%d * %d= %d\n", num, i, num * i);
        }
    }
}
