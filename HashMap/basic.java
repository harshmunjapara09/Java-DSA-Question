package HashMap;

import java.util.HashMap;
import java.util.Map;

public class basic {
    public static void main(String[] args) {
//        int[] arr = {1,1,1,1,1,3,5,6,6,4,5,8,6};
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int value : arr) {
//            if (map.containsKey(value)){
//                int oldcount = map.get(value);
//                map.put(value, oldcount+1);
//            }else {
//                map.put(value,1);
//            }
//        }
//        System.out.println(map);
//
//        for (Map.Entry s : map.entrySet()) {
//            System.out.print(s.getKey() +"="+s.getValue()+" ");
//        }
        String [] companyName = {"Hp","Dell","Asus","Mi","Oneplus+"};
        int[] price = {10000,20000,15000,16000,13000};

        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < companyName.length; i++) {
            map.put(companyName[i],price[i]);
        }
        System.out.println(map);
//        for( int i : arr){
//            map.put(i,map.getOrDefault(i,0) + 1);
//        }

//        for(int i=0; i<arr.length; i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
//        }

//        for(int i :  map.values()){
//            System.out.println(i);
//        }



//        hm.put("India",100);
//        hm.put("China",190);
//        hm.put("Us",50);
//        hm.put("Uk",10);
//        hm.put("Canada",80);
//
////        hm.remove("Uk");
////        hm.clear();
////        System.out.println(hm.size());
////        hm.clone();
//        System.out.println(hm);
    }
}
