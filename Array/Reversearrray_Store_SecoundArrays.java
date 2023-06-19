public class Reversearrray_Store_SecoundArrays {
    public static void main(String[] args) {
        int[] arr={11,12,13};
        int[] arr2=new int[arr.length];
        int j=0;
        for(int i = arr.length-1;i>=0;i--){
            arr2[j]=arr[i];
            j++;
        }
        for(int i=0;i< arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
