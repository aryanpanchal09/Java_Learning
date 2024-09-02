
import java.util.Scanner;

public class Prime 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = scanner.nextInt();

        boolean isPrime = checkPrime(num); //checkPrime Method 

        if(isPrime)
        {
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }
    }
    
    public static boolean checkPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
}    


