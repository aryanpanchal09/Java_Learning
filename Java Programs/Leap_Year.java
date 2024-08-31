import java.util.Scanner;

public class Leap_Year
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you Year: ");

        int year = scanner.nextInt();
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + (leap ? " is a lear year." : " is not a leap year."));
    }
}