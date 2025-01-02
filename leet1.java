public class leet1 {
    // class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int arr[] = { i, j };
                    return arr;

                }

            }

        }
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = {
                1, 2, 8,
        };
        int target = 10;
        System.out.println(twoSum(arr, target));
    }
}
