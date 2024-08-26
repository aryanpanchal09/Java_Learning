public class Objects_Example 
{
    public static void main(String[] args) 
    {
        int num1 = 1; // -> Prmitive Variable
        int num2 = 5;
        // int result = num1 + num2;
        // System.out.println(result);   
        

        // calc -> Refrence Varibale
        Calculator calc = new Calculator();
        
        int result = calc.add(num1,num2); 

        System.out.println(result);
    }
    
}

class Calculator
{
    int a;

    public int add(int n1,int n2)
    {
        int r = n1 + n2;
        return r;
    }
}
