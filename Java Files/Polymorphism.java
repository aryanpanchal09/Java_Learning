// Dynamic Method Dispatch - Irrespective of what type of Object we have, what type of Variable we create, it will run on what type of object we have A obj = new B(); - B method call irrespective of A & it's variable but only when it's a parent child relationship or simply Inheritance

class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("In B Show");
    }
}

class C extends A 
{
    public void show()
    {
        System.out.println("In C show");
    }
}

// class Computer
// {

// }

// class Laptop extends Computer 
// {

// }

public class Polymorphism 
{
    public static void main(String[] args) 
    {
        A obj = new A() ;
        obj.show(); // In A show

        obj = new B();
        obj.show(); // In B show now it's not going to change

        obj = new C();
        obj.show(); // In C show memory replaced now it's not going to show whenever we call obj.show() it will be of C until we create a new method
        // Computer obj1 = new Laptop();
    }
  
}
