package HashSet;

import java.util.HashSet;

public class findSubArraySum {
    public static void main(String[] args) {
        int [] arr = {1,4,5,3,6,3,7,4,0};
        int sum = 4;

        HashSet<Integer> set = new HashSet<>();
        for (int value: arr) {
            set.add(value);
        }
    }
}
