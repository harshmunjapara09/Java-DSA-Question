package HashSet.Assignment;

import java.util.HashSet;

public class checked_sum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 40, 50};
        int sum = 90;

        HashSet<Integer> set = new HashSet<>();

        for (int value : arr) {
            int target = sum - value;
            if (set.contains(target)) {
                System.out.println(target + " " + value);
            } else {
                set.add(value);
            }
        }
    }
}
