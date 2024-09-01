package tools;

class Launch
{
    public void abc()
    {
        A obj = new A();
        System.out.println(obj.marks);
    }
}


public class A 
{
    public int marks = 6;    

    public void show()
    {
        System.out.println("In Show");
    }
}
