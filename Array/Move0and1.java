package Array;

public class Move0and1 {
    public static void main(String[] args) {
        int [] arr = {0,1,0,1,0,1,0,1,0,1,0,0,1};
        int temp;
        int i=0;
        int j= arr.length-1;

        while (i < j){
            if(arr[i]==0){
                i++;
            }else if(arr[j]==1) {
                j--;
            }else{
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
//        int count0 =0;
//        int count1 =0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==0){
//                count0++;
//            }
//            if (arr[i]==1){
//                count1++;
//            }
//        }
//        int j=0;
//        for (int i = 0; i < count0; i++) {
//            arr[i]=0;
//            j++;
//        }
//        for (int i = 0; i < count1; i++) {
//            arr[j]=1;
//            j++;
//        }
//
        for(int k=0;k< arr.length;k++){
            System.out.println(arr[k]);
        }

    }
}
