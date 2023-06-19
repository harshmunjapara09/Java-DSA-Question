public class MIssing_Number_Aarrys {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,9,8,5,7,6,11};
        int n = arr.length+1;
        int sum =0;
        int missNumber=0;
        int sumofarray=n*(n+1)/2;

        for(int i=0;i< arr.length;i++){
             sum = sum + arr[i];
             missNumber = sumofarray - sum ;
        }
        System.out.println(missNumber);
    }
}
