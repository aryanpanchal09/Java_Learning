import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Palindrome Checker");
        
        String str = "level";
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed))
        {
            System.out.println(str + " is a palindrome");
        }
        else
        {
            System.out.println(str + "is not a palindrome");
        }

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Word: ");
        String str1 = scanner.nextLine();
        String reversed1 = new StringBuilder(str1).reverse().toString();
        if(str1.equals(reversed1))
        {
            System.out.println(str1 + " is a palindrome");
        }
        else
        {
            System.out.println(str1 + " is not a palindrome");
        }
        scanner.close();
    }
}
