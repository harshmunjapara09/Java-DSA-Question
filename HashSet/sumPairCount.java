package HashSet;

import java.util.HashSet;

public class sumPairCount {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 5, 5, 5,4,6};
        int sum = 10;
        int count = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int value : arr) {
            int key = sum - value;
            if (set.contains(key)){
                count++;
                System.out.println(key +" + "+ value);
            }else {
                set.add(value);
            }
        }
        System.out.println(count);
    }
}
