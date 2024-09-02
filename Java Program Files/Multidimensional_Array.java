public class Multidimensional_Array 
{
    public static void main(String args[])
    {
       int nums[][] = new int[3][4];
       int random = 0;
       
       
       for(int i=0;i<3;i++)
       {
            for(int j=0;j<4;j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
            }
       }

       for(int i=0;i<3;i++)
       {
            for(int j=0;j<4;j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
       }

       System.out.println(); // used for break
     // n[] is not a simple array it's an multidimensional array
    // advanced for loop
       for(int n[] : nums)
       {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
       }
        
    }    
}
