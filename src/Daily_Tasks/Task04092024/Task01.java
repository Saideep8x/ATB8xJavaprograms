package Daily_Tasks.Task04092024;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name,batch;
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your batch code");
        batch=sc.next();
        if(batch.equals("8X")){
            System.out.println("Welcome to AutomationTesting by Pramod datta");
        }
        else{
            System.out.println("Please enroll");
        }
        sc.close();

    }
}
