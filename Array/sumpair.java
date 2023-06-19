public class sumpair {
    public static void main(String[] args) {
        int[] arr = {11,12,33,44,12};
        int value = 74;
        for(int i = 0;i< arr.length;i++){
            for (int j=0;j<i;j++){
                int sum =arr[i]+arr[j];
                if (sum==value){
                    System.out.println("Present");
                    return;
                }
            }
        }
        System.out.println("Not Present");
    }
}
