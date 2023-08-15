package Recursion;

import java.util.ArrayList;

public class find_storeList {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,3,5,6,7};
        int target = 3;
        System.out.println(find(nums,target));
    }

    private static ArrayList find(int[] nums, int target) {
        return helper(nums,target,0,new ArrayList<>());
    }
    public static ArrayList helper(int []nums,int target,int n,ArrayList list){
        if (n==nums.length){
            return list;
        }
        if (nums[n]==target){
            list.add(n);
        }
        return helper(nums,target,n+1,list);
    }
}
