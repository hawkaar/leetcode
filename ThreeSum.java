import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        test t = new test();
        // int x[] = { -1, 0, 1, 2, -1, -4 };

        System.out.println(threeSum(t.x));

    }

    private static List<List<Integer>> threeSum(int[] nums) {

        ArrayList<List<Integer>> aList = new ArrayList<>();
        Arrays.sort(nums);

        int twoSum = 0;
        int j, k;
        for (int i = 0; i < nums.length - 2; i++) {
            j = i + 1;
            k = nums.length - 1;
            while (j < k) {
                twoSum = nums[j] + nums[k];
                if (nums[i] + twoSum > 0) {
                    k--;
                } else if (nums[i] + twoSum < 0) {
                    j++;
                } else {

                    if (!aList.contains(Arrays.asList(nums[i], nums[j], nums[k]))) {
                        aList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                    j++;
                    k--;

                }
            }

        }
        return aList;
    }

}
