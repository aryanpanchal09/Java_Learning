import java.util.Scanner;

public class TemperatureConverter 
{
    public static void main(String[] args)
    {
        System.out.println("Fahrenheit to Celsius Converter");    

        double fahrenheit = 100; // data type double - Variable fahrenheit - value pass 100
        double celsius = (fahrenheit - 32) * 5/9; // Variable Celsius - Formula pass 
        System.out.println("Celsius: " + celsius); // Answer Print 

        System.out.println("Celsius to Fahrenheit Converter");

        double celsius1 = 100;
        double fahrenheit1 = (celsius * 9/5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit1);

        System.out.println("Taking User Input Program Celsius to Fahrenheit Converter");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");

        double celsius2 = scanner.nextDouble();
        double fahrenheit2 = (celsius2 * 9/5) + 32;

        System.out.println("Fahrenheit: " + fahrenheit2);

        

        System.out.println("Fahrenheit to Celsius Converter from User Input");

        System.out.println("Enter temperatur in Fahrenheit: ");

        double fahrenheit3 = scanner.nextDouble();
        double celsius3 = (fahrenheit3 - 32) * 5/9;

        System.out.println("Celsius: " + celsius3);

        scanner.close();
    }
}
