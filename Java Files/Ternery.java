public class Ternery 
{
    public static void main(String[] args) 
    {
        int n = 45;
        int result = 0;

        // if(n%2==0) // getting even number
        // {
        //     result = 10;
        // }
        // else // odd number
        // {
        //     result = 20;
        // }
        // System.out.println(result);


        result = n%2==0 ? 10 : 20;
        System.out.println(result);
    }    
}
