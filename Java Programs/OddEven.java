import java.util.Scanner;

public class OddEven 
{
    public static void main(String[] args) 
    {
        int num = 5;
        if(num % 2 == 0) // % returns reminder while / return Quotent
        {
            System.out.println(num + " Is Even");
        }
        else
        {
            System.out.println(num + " Is Odd");
        }    


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int number = scanner.nextInt();
        if(number % 2 == 0)
        {
            System.out.println("The number you entered is : " + number + " - which is a Even number");
        }
        else
        {
            System.out.println("The number you entered is : " + number + " - which is a Odd number");
        }
        scanner.close();
    }    
}
