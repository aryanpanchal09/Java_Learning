
class Human
{
    private int age; // age is accessible only in the same class - int default value 0 - We can assign value here also
    private String name; // default value String null - We can directly assign value here also
 
    public Human()
    {
        System.out.println("In Constructor");
        age = 13;
        name = "John";
    }

    public int getAge() // We can access age here inside the method of same class - bcz it's defined in the same class
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
public class Constructor 
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge()); 

        // obj.setAge(30); 
        // obj.setName("Aryan");       
    } 
}
