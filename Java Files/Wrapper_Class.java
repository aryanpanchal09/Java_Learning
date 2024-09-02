public class Wrapper_Class 
{
    public static void main(String[] args) 
    {
        int num = 7; // store value in obj/class type
       // Integer num1 = new Integer(8); // It means its deplicated or we have a better alternative not a good way to assign value - boxing storing primitive value in wrapper 

       // Integer num1 = 8; // Directly assign value
        Integer num1 = num; // autoboxing - Store primitive data type to Object 
    //    int num2 = num1.intValue(); // unboxing - Getting value from Object type to Primitive type
        int num2 = num1; // auto-unboxing
        System.out.println(num1);
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }    
}

/*
Primitive Data doesn't extends Objects

Wrapper Class 
int - Integer
char - Character
double - double

For every primitive type we have a Class
 */
