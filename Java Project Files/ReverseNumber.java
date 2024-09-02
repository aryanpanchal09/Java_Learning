import java.util.Scanner;

public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);    
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;

        while(num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }    
}


/*
One Problem in the above logic is that it only rely on reminder of 10 means if we enter a number whose reminder ends with 0 it will not return that

1000 - reversed number answer will be - 1 - instead of 0001
 */