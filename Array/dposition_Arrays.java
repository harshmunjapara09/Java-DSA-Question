package Array;

public class dposition_Arrays {
    public static void main(String[] args) {
        int[] arr={11,12,13,14,15,16,17};
        int d=2;
        int j=0;
        int[] temp = new int[arr.length];
        for (int i=d;i< arr.length;i++){
               temp[j]= arr[i];
               j++;
        }
        for(int i=0;i<d;i++){
            temp[j]=arr[i];
            j++;
        }

        for(int i=0;i< arr.length;i++){
            arr[i]=temp[i];
        }

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

    }
}
