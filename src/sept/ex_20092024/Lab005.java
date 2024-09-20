package sept.ex_20092024;

public class Lab005 {
    public static void main(String[] args) {

    int year = 2024;

    // Check if the year is a leap year
        if ((year % 4 == 0)&&(year % 100 == 0)&&(year % 400 == 0)) {
            System.out.println("Leap year");
    }
        else {
            System.out.println("Not Leap year");
        }
}
}
