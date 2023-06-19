public class Segregate_Odd_Even {
    public static void main(String[] args) {
        int[] arr ={11,13,44,15,55,44,33,23,32};
        
        int left =0;
        int right = arr.length-1;
        while (left < right){
            while (arr[left]%2==0 ){
                left++;
            }
            while (arr[right]%2!=0 ){
                right--;
            }
            if(left < right) {
              int temp = arr[left];
               arr[left]=arr[right];
               arr[right]=temp;
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
