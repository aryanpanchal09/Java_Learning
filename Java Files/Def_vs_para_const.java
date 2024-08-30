
class Human
{
    private int age; // age is accessible only in the same class - int default value 0 - We can assign value here also
    private String name; // default value String null - We can directly assign value here also

    

    public Human() {
        age = 12;
        name = "Aryan";
    }
    

    public Human(int age, String name) {
    this.age = age;
    this.name = name;
    }


    public Human(String name) {
        this.age = 12;
        this.name = name;
    }


    /*
    public Human() // default constructor
    {
        System.out.println("In Constructor");
        age = 13;
        name = "John";
    }
 
    public Human(int a, String n) 
    {
        age = a;
        name = n;
    }
 */
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
public class Def_vs_para_const 
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        Human obj1 = new Human("Aryan");
        System.out.println(obj.getName() + " : " + obj.getAge()); 
        System.out.println(obj1.getName() + " : " + obj1.getAge());

        // obj.setAge(30); 
        // obj.setName("Aryan");       
    } 
}
