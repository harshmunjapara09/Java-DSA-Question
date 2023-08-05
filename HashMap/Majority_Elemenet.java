package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Majority_Elemenet {
    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 8, 5};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int value : arr) {
            if (map.containsKey(value)) {
                int oldcount = map.get(value);
                map.put(value, oldcount + 1);
            } else {
                map.put(value, 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Integer,Integer> s : map.entrySet()) {
            if (s.getValue() > n/3) {
                System.out.println(s.getKey() + " " + s.getValue());
            }
        }
    }
}
