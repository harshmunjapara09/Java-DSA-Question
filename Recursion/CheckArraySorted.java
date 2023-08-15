package Recursion;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 55, 66};
        System.out.println(checked(nums, nums.length - 1));
    }

    private static boolean checked(int[] nums, int n) {
        return helper(nums, n, false);
    }

    private static boolean helper(int[] nums, int n, boolean ans) {
        if (n == 0) {
            return ans;
        }
        if (nums[n] < nums[n - 1]) {
            ans = false;
            return ans;
        } else {
            ans = true;
        }
        return helper(nums, n - 1,ans);
    }

}
