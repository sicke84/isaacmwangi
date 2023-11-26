import java.util.Scanner;

public class Leapyear{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year");
        int year = scanner.nextLine();

        if (isLeapyear(year)) {
            system.out.println("correct! it is a leap year");

        } else{
            System.out.println("Invalid! not a leap year");
        }
        scanner.close();
    }
    public static boolean isLeapyear(int year) {
        // condition
        // if the year is divisible by 4
        // if the year is divisible by 400, not divisible by 100

        return(year % 4 ==0) && (year % 100 !=0 || year % 400 == 0);
    }
    }
}