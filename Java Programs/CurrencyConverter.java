import java.util.Scanner;

public class CurrencyConverter
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the currency to convert from (USD/EUR/JPY): ");
        String fromCurrency = scanner.nextLine();

        System.out.println("Enter the currency to convert to (USD/EUR/JPY): ");
        String toCurrency = scanner.nextLine();

        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();

        double convertedAmount = convert(fromCurrency, toCurrency, amount); // convertedAmount - arguments passed
        System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " " + toCurrency);
        
    }

    public static double convert(String from, String to, double amt)
    {
        double result = 0;
        switch(from)
        {
            case "USD":
            result = (to.equals("EUR")) ? amt * 0.85 : amt * 110.10;
            break;
            
            case "EUR":
            result = (to.equals("USD")) ? amt * 1.18 : amt * 129.70;
            break;

            case "JPY":
            result = (to.equals("USD")) ? amt * 0.0091 : amt * 0.0077;
            break;
        }
        return result;
    }
}
