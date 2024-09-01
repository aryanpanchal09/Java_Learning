import tools.*;

class C extends A
{
    public void abc()
    {
        System.out.println(marks);
    }
}

public class Access_Modifier 
{
    public static void main(String[] args) 
    {
        A obj = new A();
        System.out.println(obj.marks);
        obj.show();

        B obj1 = new B();
        System.out.println(obj1.marks);    
    }    
}
