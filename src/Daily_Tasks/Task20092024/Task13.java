package Daily_Tasks.Task20092024;

import java.util.Scanner;
//Check the sides of a triangle using if elseif else condition where user
////gives the input.
public class Task13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side1,side2,side3;
        System.out.println("Enter side1");
        side1=sc.nextInt();
        System.out.println("Enter side2");
        side2=sc.nextInt();
        System.out.println("Enter side3");
        side3=sc.nextInt();
        if(side1==side2 && side2==side3 && side1==side3){
            System.out.println("Equilateral triangle");
        }
        else if (side1==side2 || side2==side3 || side1==side3){
            System.out.println("Iscoceles triangle");
        }
        else {
            System.out.println("Scalene triangle");
        }

    }
}
