class Laptop
{
    String model;
    int price;
    // String serial;

    
    // public String toString()
    // {
    //     return model + " : " + price;
    // }

    // public boolean equals(Laptop that)
    // {
    //     // if(this.model.equals(that.model) && this.price == that.price)
    //     // {
    //     //     return true;
    //     // }
    //     // else 
    //     // {
    //     //     return false;
    //     // }

    //      return this.model.equals(that.model) && this.price == that.price;

        
    // }

    @Override
    public String toString() {
        return "Laptop [model = " + model + ", price = " + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}

public class Obj_Class_String_Hashcode 
{
    public static void main(String[] args) 
    {
        Laptop obj = new Laptop();
        obj.model = "Lenovo X1 Carbon";
        obj.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo X1 Carbon";
        obj2.price = 1000;

        boolean result = obj.equals(obj2); // Eventhough obj1 and obj2 have same value they both are not equal just becuase it has diff obj name now we want to compare it with the value assign in the obj
        System.out.println(result);

        // System.out.println(obj); Both will print the same thing
        System.out.println(obj.toString()); // Printing Garbage Value
    }    
}

/*
Everytime we try to call obj it will also call .toString() method
 */
