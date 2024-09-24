package Daily_Tasks.Task23092024;

import java.util.Scanner;

/*Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
Input. -
choice - 1 - km → m, km → 1km
choice - 2 - f → c, f → c*/

///Performing above program using nested switch.
public class Task18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String choice="";
        System.out.println("Choose any choice(choice1,choice2)");
        choice=sc.next();
        switch (choice){
            case "choice1":
                String option1="";
                System.out.println("Choose any option(km,m)");
                option1=sc.next();
                switch(option1){
                    case "km": //Kilometers to miles
                        double Miles;
                        System.out.println("Enter Kilometers");
                        int Kilometers=sc.nextInt();
                        Miles=(Kilometers*(0.621371));
                        System.out.println(Miles+"m");
                        break;
                    case "m": //Miles to kilometers
                        double km;
                        System.out.println("Enter Miles");
                        int m=sc.nextInt();
                        km=(m*1.60934);
                        System.out.println(km+"km");
                        break;
                }
                break;
            case "choice2":
                String option2="";
                System.out.println("Choose any option(Fah,Cel)");
                option2=sc.next();
                switch(option2){
                    case "Fah": //Celsius to Fahrenheit
                        int Fahrenheit;
                        System.out.println("Enter Celsius");
                        int Celsius=sc.nextInt();
                        Fahrenheit=((Celsius*9/5)+32);
                        System.out.println(Fahrenheit+"°F");
                        break;
                    case "Cel": //Fahrenheit to Celsius
                        System.out.println("Enter Fahrenheit");
                        Fahrenheit=sc.nextInt();
                        Celsius=((Fahrenheit-32)*5/9);
                        System.out.println(Celsius+"°C");
                        break;
                }
        }
    }
}