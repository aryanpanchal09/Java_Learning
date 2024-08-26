public class Type_Conversion 
{
    public static void main(String[] args) 
    {
        byte b = 127;
        int a = 257;
        byte k = (byte)a;

        float f = 5.6f;
        int t = (int)f;

        byte c = 10;
        byte d = 20;

        int result = c * d;

        System.out.println(b);
        System.out.println(a);
        System.out.println(k);
        System.out.println(t);
        System.out.println(result);
    }    
}
