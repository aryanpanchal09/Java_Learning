public class If_Else
{
    public static void main (String args[])
    {
        int x = 281;
        int y = 700;
        int z = 600;

        if(x>y && x>z) // false, 11 - 20
        {
            System.out.println(x);
            System.out.println("X is greatest");
        }
        else if(y>z)
        {
            System.out.println(y);
            System.out.println("Y is greatest");
        }
        else
        {
            System.out.println(z);
            System.out.println("Z is greatest");
        }
        
    }
}