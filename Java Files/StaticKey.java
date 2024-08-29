class Mobile
{
    String brand; // Instance variable
    int price;
    static String name; // we are making this variable common for all objects

    public void show() // Varibale inside the method Local Varibale
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticKey 
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
    }    
}
