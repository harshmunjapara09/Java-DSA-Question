public class move0and1 {
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

        for(int k=0;k< arr.length;k++){
            System.out.println(arr[k]);
        }

    }
}
