public class Arrays_Twice {
    public static void main(String[] args) {
        int[] arr = {11,12,13};
        int[] arr2 = new int [arr.length*2];
        int j=0;
        for(int i=0;i<arr.length;i++){
            arr2[j]=arr[i];
            j++;
            arr2[j]=arr[i];
            j++;
        }
        for(int i=0;i< arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
