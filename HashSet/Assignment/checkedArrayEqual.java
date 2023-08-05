package HashSet.Assignment;

import java.util.HashSet;

public class checkedArrayEqual {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {6, 2, 3, 4,1};

        HashSet<Integer> set = new HashSet<>();

        for (int value : arr) {
            set.add(value);
        }
        for (int value : arr1) {
            if (!set.contains(value)){
                System.out.println("false");
                return;
            }
            set.remove(value);
        }

        System.out.println(set.isEmpty());
    }
}
