// package com.google.calculation;

import java.util.ArrayList;
import tools.*;
import tools.AdvCalc1; 

class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
    // public void config()
    // {
    //     System.out.println("In A Config");
    // }
}
class B extends A
{
    public void show()
    {
        System.out.println("In B Show");
    }
}

public class Method_Overriding 
{
    public static void main(String[] args) 
    {
        // B obj = new B();
        // obj.show();    
        // obj.config();
    
        ArrayList list = new ArrayList();

        Calc1 obj = new Calc1();
        int r1 = obj.add(3,4);
        System.out.println(r1);

    }
}
