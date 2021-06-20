package src;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        
        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {

            nums[i] += runningSum;
            runningSum = nums[i];
        }

        return nums;
    }
}
