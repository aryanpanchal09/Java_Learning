import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter you number : ");

        int number = scanner.nextInt();

        System.out.println("Factorial of " + number + " = " + factorial(number));    
        
    }

    static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }
}    

