package HashSet.Assignment;

import java.util.HashSet;

public class array_subsetanotherarray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6};
        int[] arr2 = {1,4,6};

        HashSet<Integer> hashSet = new HashSet<>();

        for (int value: arr1) {
            hashSet.add(value);
        }
        for (int value : arr2) {
            if (!hashSet.contains(value)){
                System.out.println("Not a SubSet");
                return;
            }
        }
        System.out.println("SubSet of another array");
    }
}
