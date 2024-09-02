import java.util.Random;
import java.util.Scanner;

public class Password_Generator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the desired length of the password : ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase letters? (true/false): ");
        boolean includeUppercase = scanner.nextBoolean();

        System.out.print("Include lowercase letters? (true/false): ");
        boolean includeLowercase = scanner.nextBoolean();

        System.out.print("Include digits? (true/false): ");
        boolean includeDigits = scanner.nextBoolean();

        System.out.print("Include special characters? (true/false): ");
        boolean includeSpecialChars = scanner.nextBoolean();

        String password = generatePassword(random,length,includeUppercase,includeLowercase,includeDigits,includeSpecialChars);
        System.out.println("Generate Password: " + password);
    }    

    public static String generatePassword(Random random,int length, boolean includeUppercase, boolean includeLowercase, boolean  includeDigits, boolean includeSpecialChars)
    {
        StringBuilder password = new StringBuilder();
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "1234567890";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        StringBuilder charPool = new StringBuilder();
        if(includeUppercase) charPool.append(uppercase);
        if(includeLowercase) charPool.append(lowercase);
        if(includeDigits) charPool.append(digits);
        if(includeSpecialChars) charPool.append(specialChars);

        if(charPool.length() == 0)
        {
            throw new IllegalArgumentException("At least one character type must be selected");
        }

        for(int i = 0; i < length; i++)
        {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        return password.toString();
    }
}
