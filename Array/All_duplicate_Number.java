package Array;
public class All_duplicate_Number {
    public static void main(String[] args) {
        int[] arr = {16,11,12,15,11,13,14,15,16};

        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }

    }
}
