package HashMap.Assignment;

import java.util.HashMap;

public class countfrequency {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,4,3,26,7,8,2,2,4,5,2};

        HashMap<Integer,Integer> map = new HashMap<>();

//        for (int value: arr) {
//            map.put(value, map.getOrDefault(value,0)+1);
//        }

        for (int value : arr) {
            if (map.containsKey(value)){
                int oldcount = map.get(value);
                map.put(value,oldcount+1);
            }else {
                map.put(value,1);
            }
        }
        System.out.println(map);
    }
}
