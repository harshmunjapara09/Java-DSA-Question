public class Array_Twotime_copy_newarray {
    public static void main(String[] args) {
        int[] arr = {11,12,13,14,15};
        int n = arr.length;
        int[] arr2  = new int [arr.length*2];

        for(int i=0;i< arr.length;i++){
            arr2[i]=arr[i];
            arr2[i+n]=arr[i];
        }
        for(int i=0;i< arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
