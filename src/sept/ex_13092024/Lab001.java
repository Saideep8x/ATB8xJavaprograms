package sept.ex_13092024;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the number");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.printf("%d * %d= %d\n", num, i, num * i);
        }
    }
}
