package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,2};
        Sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void Sort(int[] arr, int r, int c) {
        if (r==0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            Sort(arr,r,c+1);
        }else {
            Sort(arr,r-1,0);
        }
    }
}