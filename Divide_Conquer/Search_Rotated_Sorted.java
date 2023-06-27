package Divide_Conquer;
public class Search_Rotated_Sorted {
    public static void main(String[] args) {
        int [] arr = {6,7,8,9,0,1,2,3,4,5};
        int target = 2;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    private static int search(int[] arr, int target, int si, int ei) {
        if (si>ei){
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid]==target){
            return mid;
        }
        if (arr[si]<=arr[mid]){
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr,target,si,mid-1);
            }else {
                return search(arr,target,mid+1,ei);
            }
        }
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr,target,mid+1,ei);
            }else {
                return search(arr,target,si,mid-1);
            }
        }
    }
}
