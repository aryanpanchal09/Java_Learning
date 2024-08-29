class Mobile
{
    String brand; // Instance variable
    int price;
    static String name; // we are making this variable common for all objects

    static // initializing static block once 
    {
        name = "phone";
        System.out.println("in static block");
    }

    public Mobile()
    {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

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

public class Static_Block 
{
    public static void main(String[] args) throws ClassNotFoundException 
    {
        Class.forName("Mobile"); // we use this to load the class

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // // obj1.name = "Smartphone"; We have to use Static Variable with its Class Name 
        // Mobile.name = "Phone";

        // Mobile obj2 = new Mobile();


    }    
}
