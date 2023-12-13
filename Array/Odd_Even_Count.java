package Array;

public class Odd_Even_Count {
    public static void main(String[] args) {
        int[] arr = {11,12,13,14,15,16,17};

        int even=0;
        int odd=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println(odd +" "+ even);
    }
}

