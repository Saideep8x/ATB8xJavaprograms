package sept.ex_20092024;

import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {
        int Score;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Score");
        Score=sc.nextInt();
        String grades=(Score>=90)?"A":(Score>=80)?"B":(Score>=70)?"C":"F";
        System.out.println(grades);
    }
}
