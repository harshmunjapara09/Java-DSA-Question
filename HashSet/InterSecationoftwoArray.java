package HashSet;

import java.util.HashSet;
import java.util.logging.Handler;

public class InterSecationoftwoArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {2,4,6,7,8};

        HashSet<Integer> set = new HashSet<>();
        int count =0;

        for (int value: arr1) {
            set.add(value);
        }
        for (int value: arr2) {
            if (set.contains(value)){
                count++;
                set.remove(value);
            }
        }
        System.out.println(count);
     }
}
