package Daily_Tasks.Task23092024;

import java.util.Scanner;

/*Create a simple calculator that performs addition, subtraction, multiplication,
and division, modus based on user input using switch statements.
Input :   num 1, num 2, +
Output :  num1+num2 → print information.*/
public class Task16 {
    public static void main(String[] args) {
        int num1,num2;
        String option = "";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1");
        num1=sc.nextInt();
        System.out.println("Enter the number2");
        num2=sc.nextInt();
        while (!option.equals("%")) {
            System.out.println("Choose operation to perform(+,-,*,/,%)");
            option = sc.next();
            switch (option) {
                case "+":
                    int num3 = num1 + num2;
                    System.out.println("Addition of two numbers is: " + num3);
                    break;
                case "-":
                    System.out.println("Subtraction of two numbers is: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Multiplication of two numbers is: " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("Division of two numbers is: " + (num1 / num2));
                    break;
                case "%":
                    System.out.println("Remainder of two  numbers is: " + (num1 % num2));
                    break;
                default:
                    System.out.println("Default option");
                    break;
            }
        }
    }
}

