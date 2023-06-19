package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class move1and0 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,0,0,1,0,1,0};
        int left = 0;
        int right = arr.length-1;

        while (left < right){
            if(arr[left]==1){
                left++;
            }
            if(arr[right]==0){
                right--;
            }
            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
