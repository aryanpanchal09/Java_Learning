/* final - variable, method, class
Final Variable simply means making Constant
Whenever we have a value which we don't wanna change we use Final Keyword
Ex - Value of Pie 

Final class will stop the inheritance
*/

class Calc // now it's not going to extended
{
    public final void show() 
    {
        System.out.println("In Calc Show");
    }
    public void add(int a, int b) 
    {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc 
{
    public void show1()
    {
        System.out.println("By Aryan");
    }
}

public class Final 
{
    public static void main(String[] args) 
    {
        // final int num = 8;
        // System.out.println(num);    

        AdvCalc obj = new AdvCalc(); // Overriding show method and using add method to prevent this use final method
        obj.show1(); // Now we cannot use show() because it's final that's why we had to use show1()
        obj.add(4,5);
    }    
}
