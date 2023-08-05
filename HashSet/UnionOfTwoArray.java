package HashSet;

import java.util.HashSet;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4};

        HashSet<Integer> set = new HashSet<>();
        for (int value: arr1) {
            set.add(value);
        }
        for (int value: arr2) {
            set.add(value);
        }
        System.out.println(set.size());
    }
}
