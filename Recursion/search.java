package Recursion;

public class search {
    public static void main(String[] args) {
        int [] nums= {1,2,3,4,5,6};
        int target = 3;
        int indx = searchlin(nums,0,target);
        System.out.println(indx);
    }

    private static int searchlin(int[] nums, int n,int target) {
        if (nums.length==n){
            return -1;
        }
        if (nums[n]==target){
            return n;
        }
        return searchlin(nums,n+1,target);
    }
}
