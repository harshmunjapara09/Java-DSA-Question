package Array;

public class All_Unique_Number {
    public static void main(String[] args) {
        int[] arr = {11, 11, 11, 12, 15, 12, 13, 14, 15};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=-1){
                System.out.println(arr[i]);
            }
        }
    }
}
