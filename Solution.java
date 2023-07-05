class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    if (Math.abs(i-j)<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}