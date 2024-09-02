import java.util.Scanner;

public class MaxofThree 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = Math.max(num1,Math.max(num2, num3));  // Math.max mehtod buit-in java function that returns the larger of two int values
        // Math.max() first num2 and num3 are called first and returns the largest of the two
        // num2 and num3 bigger value result further passed which compare with num1
        System.out.println("Maximum: " + max);
    }    
}
