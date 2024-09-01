import java.util.ArrayList;
import java.util.List;

public class SumOfTwo {
//     public static void main(String args[]) {
//         int target = 9;
//         int num[] = { 2, 3, 5, 7 };

//         int[] result = sum(num, target);
//         System.out.println("Indices: [" + result[0] + " , " + result[1] + "]");
//     }

//     public static int[] sum(int[] num, int target) {

//         for (int i = 0; i < num.length; i++) {
//             for (int j = i + 1; j < num.length; j++) {
//                 if (num[i] + num[j] == target) {
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         throw new IllegalArgumentException("No Solution");
//     }
// }


    public static void twoSum(int[] nums, int target) {
        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Loop through the remaining elements to find the complement
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the two numbers add up to the target
                if (nums[i] + nums[j] == target) {
                    // Print the numbers if a match is found
                    System.out.println(nums[i] + " + " + nums[j] + " = " + target);
                    return;
                }
            }
        }
        
        // If no solution is found, print a message
        System.out.println("No two numbers add up to " + target);
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method
        twoSum(nums, target);
    }
}
