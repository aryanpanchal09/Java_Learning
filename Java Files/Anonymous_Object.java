public class Anonymous_Object 
{
    public static void main(String[] args) 
    {
        A obj = new A(); // obj - refrence varibale
        obj.show();    // show() - It's real Object
    }    
}

class A
{
    public void show()
    {
        System.out.println("In a show");
    }
}