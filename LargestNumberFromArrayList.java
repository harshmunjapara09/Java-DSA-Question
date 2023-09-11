import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumberFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

//        list.add(50);
//        list.add(8);
//        list.add(13);
//        list.add(6);
//        list.add(26);

        Collections.sort(list,new NumComparetor());
        System.out.println(list);
    }
}

class NumComparetor implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        String s1 = String.valueOf(o1);
        String s2 = String.valueOf(o2);

        int a = Integer.valueOf(s1 + s2);
        int b = Integer.valueOf(s2 + s1);

        if (a > b) {
            return -1;
        } else if (b > a) {
            return 1;
        }
        return 0;
    }
}
