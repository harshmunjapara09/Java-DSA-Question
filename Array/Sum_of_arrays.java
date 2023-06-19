public class Sum_of_arrays {
    public static void main(String[] args) {
        int[] arr ={11,12,1,3,14,1,4,3,2,3};
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum =sum +arr[i];
        }
        System.out.println(sum);
    }
}
