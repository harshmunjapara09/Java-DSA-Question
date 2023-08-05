package HashMap.Assignment;

import java.util.HashMap;
import java.util.Map;

public class MostfrequencyEle {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,4,3,26,7,8,2,2,4,5,2};

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int value: arr) {
            map.put(value, map.getOrDefault(value,0)+1);
        }
        Map.Entry<Integer,Integer> ans = null;
        for (Map.Entry<Integer,Integer> s: map.entrySet()) {
            if (ans == null || ans.getValue() < s.getValue()){
                ans = s;
            }
        }
        System.out.println(ans.getKey() + " " + ans.getValue());
    }
}
