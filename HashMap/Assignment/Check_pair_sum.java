package HashMap.Assignment;

import java.util.HashMap;
import java.util.Map;

public class Check_pair_sum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,3};
        int sum =10;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer i : arr) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        for (Map.Entry<Integer,Integer> i : map.entrySet()) {
            if (i.getValue() >= 2  && i.getKey() * 2 == sum){
                System.out.println("Sum of Pair are Available"+ i.getKey() + " " + i.getKey());
                return;
            }else {
                int opr = sum - i.getKey();
                if (map.containsKey(opr)){
                    System.out.println("Sum of Pair are Available"+ " " +opr+" " + i.getKey());
                    return;
                }
            }
        }
        System.out.println("Sum of Pair are not Available");
    }
}
