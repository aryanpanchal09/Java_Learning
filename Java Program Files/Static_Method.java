class Mobile
{
    String brand; // Instance variable
    int price;
    static String name; // we are making this variable common for all objects

    public void show() // Instace Method - Varibale inside the method Local Varibale
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println("In Static Method");
        System.out.println(obj.brand + " : " + obj.price + " : " + obj.name); // we can't use variable in static method we can use it with the help of obj refrence
    }
}

// We want to call main we have to create a obj of class main to solve it with use Static

public class Static_Method
{
    public static void main(String[] args) 
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        // obj1.name = "Smartphone"; We have to use Static Variable with its Class Name 
        Mobile.name = "Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        // obj2.name = "Smartphone";
        Mobile.name = "Phone";

        obj1.name = "Phone"; // now the name will be shift from smartphone to Phone in every object

        obj1.show();
        obj2.show();

        Mobile.show1(obj1); // Static Method can be directly called
    }
}