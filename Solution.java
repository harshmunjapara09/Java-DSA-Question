import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
       int[] num = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(RotateArray(num,2)));
    }
    public static int[] RotateArray(int[] nums,int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        int count = 0;
        int j=0;
        for (int i = nums.length-1; i >=0 ; i--) {
            if (count==n){
                break;
            }
            ans[j]=nums[i];
            nums[i]=0;
            j++;
            count++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                break;
            }
            ans[j]= nums[i];
            j++;
        }

        return ans;
    }
}