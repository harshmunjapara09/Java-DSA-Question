public class duplicate {
    public static void main(String[] args) {
        int[] arr={11,12,13,14,13,11,15};
        int value = 15;
        int counter=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                counter++;
            }
        }
        if(counter > 1){
            System.out.println("Duplicate");
        }else {
            System.out.println("Not Duplicate");
        }
    }
}
