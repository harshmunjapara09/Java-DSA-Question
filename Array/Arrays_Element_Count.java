package Array;

public class Arrays_Element_Count {
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,0,5,1,5,6,7,8,9,10};
        int[] ans = new int[11];

        for(int i=0;i<arr.length;i++){
            ans[arr[i]]=ans[arr[i]] +1;
        }
        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
