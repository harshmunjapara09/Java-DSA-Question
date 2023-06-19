public class Two_Arrays_Merge_and_Sort {
    public static void main(String[] args) {
        int[] arr1 = {1,4,5,6,9,10};
        int n1 = arr1.length;
        int[] arr2 = {2,3,7,8};
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];
        int n3= arr3.length;
        int i=0,j=0,k=0;

        while (i < n1 && j < n2){
            if (arr1[i] < arr2[j]) {
                arr3[k]=arr1[i];
                i++;
                k++;
            } else {
                arr3[k]=arr2[j];
                j++;
                k++;
            }

        }
        while (i < n1) {
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while (j < n2){
            arr3[k]=arr2[j];
            j++;
            k++;
        }

        for(k=0;k<n3;k++){
            System.out.print(arr3[k] + " ");
        }
    }
}
