import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args)
    {
        
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series Till " + n + ":");
        for(int i = 1; i <= n; ++i)
        {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = scanner.nextInt();
        int ft = 0;
        int st = 1;
        for(int i = 1; i <= number; ++i)
        {
            System.out.print(ft + ",");
            int nt = ft + st;
            ft = st;
            st = nt;
        }
        scanner.close();
    }
    
}
