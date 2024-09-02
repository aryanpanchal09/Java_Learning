class A 
{
    public void show()
    {
        System.out.println("In A show");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("In B show");
    }
}

public class UpCasting_DownCasting 
{
    public static void main(String[] args) 
    {
        // double d = 4.5;
        // int i = (int)d; // typecasting double to int
        // System.out.println(i);    

        // A obj = (A) new B(); // obj is of A but refer to the B is known as Upcasting
        // obj.show();

        A obj = new B();
        obj.show();

        B obj1 = (B) obj; // Obj of A we call method of Obj B
        obj1.show2(); // Downcasting 

        // In general Upcating and Downcasting is known as TypeCasting


    }    
}
