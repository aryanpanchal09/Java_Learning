public class Methods_Demo 
{
    public static void main(String[] args) 
    {
        Computer obj = new Computer();

        obj.playmusic();
        String str = obj.getMeAPen(10);
        System.out.println(str);
    }    
}

class Computer
{
    public void playmusic()
    {
        System.out.println("Playing Music");
    }

    public String getMeAPen(int cost)
    {
        if(cost>=10)
        {
            return "Pen";
        }
        else
        {
            return "Nothing";
        }
    }
}


