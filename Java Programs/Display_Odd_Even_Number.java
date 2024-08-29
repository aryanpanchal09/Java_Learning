import java.util.Scanner;

public class Display_Odd_Even_Number 
{
    public static void main(String[] args) 
    {
        System.out.println("Odd number from 1 to 100");    
        for(int i =1; i < 101; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println("");

        System.out.println("Even number from 1 to 100");
        for(int i = 1; i < 101; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        for(int i = num1; i <= num2; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        if(num1 > num2)
        {
            System.out.println("Error num2 should be bigger than num1");
        }
    }    
}

