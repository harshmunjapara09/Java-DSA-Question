package Divide_Conquer;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int [] arr = {3,5,6,3,25,9};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int si, int ei) {
        if (si>=ei){
            return;
        }

        int idx = paartition(arr,si,ei);
        quickSort(arr,si,idx-1);
        quickSort(arr,idx+1,ei);
    }

    private static int paartition(int[] arr, int si, int ei) {
        int pivot = arr[ei];

        int i= si-1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <=pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
}
