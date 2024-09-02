public class Logical_Operators 
{
 public static void main(String[] args) 
 {
    int x = 7;
    int y = 5;
    int a = 5;
    int b = 9;
    
    boolean result = x > y && a > b;
    boolean result1 = x > y || a > b;
    boolean result2 = x > y;
    
    System.out.println(result);
    System.out.println(result1);
    System.out.println(!result2);
 }   
}