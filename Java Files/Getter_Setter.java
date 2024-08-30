
class Human
{
    private int age; // age is accessible only in the same class - int default value 0
    private String name; // default value String null

    public int getAge() {
        return age;
    }

    // this keyword represents the current object
    /*
     
    Human obj - optional
    { Human obj1 = obj
    obbj1.age } - we can use this keyword

     */

    public void setAge(int age) {
                        // Here we can say that obj1.age is an instance variable
        this.age = age; // this keyword is used when local variable and instance varibale had name same
        // But here a new object is created
        // How to differentiate between local and instance variable is by passing the object itself
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // a is a local variable
    // age is a instance variable
    
}

public class Getter_Setter 
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        obj.setAge(30); // Assigning the value with the help of methods
        obj.setName("Aryan");

        System.out.println(obj.getName() + " : " + obj.getAge()); // Getting the value with the help of methods
    }    
}
