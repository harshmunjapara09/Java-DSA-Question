package Recursion.Assignment;

public class LargesteEle {
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 51, 3, 11};
        largest(nums, nums.length - 1);
        System.out.println(max);
    }

    private static void largest(int[] nums, int n) {
        if (n == -1) {
            return;
        }
        max = Math.max(max, nums[n]);
        largest(nums, n - 1);
    }

}
