public class Method_Overloading
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        double r1 = calc.add(3,4);
        System.out.println(r1);
    }
}

class Calculator
{
    public int add(int n1, int n2)
    {
        // int result = n1 + n2;
        // return result;

        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2)
    {
        return n1 + n2;
    }
}