package Recursion;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        System.out.println(findIndex(arr, target, 0, arr.length - 1));

    }

    private static int findIndex(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;
        if (arr[mid]==target){
            return mid;
        }

        if (arr[mid] > target){
            return findIndex(arr,target,s,mid-1);
        }
        return findIndex(arr,target,mid+1,e);
    }
}
