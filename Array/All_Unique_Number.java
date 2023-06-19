public class All_Unique_Number {
    public static void main(String[] args) {

        int[] arr = {11,11,11,12,15,12,13,14,15};

        for(int i=0;i< arr.length;i++){
            int j;
            for (j=0;j<i;j++){
                if(arr[i]==arr[j]){
                break;
                }
            }
            if(i==j){
                System.out.print(arr[j] + " ");
              }
        }

    }
}
