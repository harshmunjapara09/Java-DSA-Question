import java.util.Arrays;

public class smallnumfind {
    public static void main(String[] args) {
        int[] arr={11,12,16,14,5};
        for(int i=0;i< arr.length;i++){
            int count =0;
            for (int j=0;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}
