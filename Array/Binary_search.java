public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {11,12,13,14,15};
        int left = 0;
        int right = arr.length-1;
        int value= 14;

        while (left < right){
            int mid = (left + right) / 2;
            if(arr[mid]==value){
                System.out.println("Present");
                return;
            } else if (value>arr[mid]) {
                left = mid + 1;
            } else if (value<arr[mid]) {
                right = mid - 1;
            }
        }
            System.out.println("value not found");
    }
}
