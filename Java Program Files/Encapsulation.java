// We are binding our data with methods so that nobody can access the data without methods means use variable directly is not possible 

class Human
{
    private int age = 11; // age is accessible only in the same class - int default value 0
    private String name = "Aryan"; // default value String null

    public int getAge() // We can access age here inside the method of same class - bcz it's defined in the same class
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }
}



public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        obj.setAge(30); // Assigning the value with the help of methods
        obj.setName("Aryan");

        System.out.println(obj.getName() + " : " + obj.getAge()); // Getting the value with the help of methods
    }    
}
