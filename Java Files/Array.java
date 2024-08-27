public class Array 
{
    public static void main(String args[])
    {
        int nums[] = {3,7,2,4};
        nums[1] = 6; // change the 2nd value 7 - 6
        System.out.println(nums[0]);

        int num[] = new int[4];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        System.out.println(num[1]); // to print 1 array

        for(int i=0;i<=3;i++)
        {
            System.out.println(num[i]); // to print all the value 
        }
        
    }    
}
