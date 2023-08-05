package HashSet;

import java.util.HashSet;
public class countUniqueAndDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,2,1};

        HashSet<Integer> set = new HashSet<>();
//        count Unique Value
        System.out.println("Unique of Number of Array : ");

        for (int value : arr) {
            if (!set.contains(value)){
                System.out.print(value+" ");
            }
            set.add(value);
        }
        System.out.println();

        HashSet<Integer> set2 = new HashSet<>();
//         Duplicate Value
        System.out.println("Duplicate of Number of Array : ");
        for (int value: arr) {
            if (set2.contains(value)){
                System.out.print(value +" ");
            }
            set2.add(value);
        }
    }
}
