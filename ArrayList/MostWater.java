package ArrayList;

import java.util.ArrayList;

public class MostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

//     Brute force
//        int ans = storewater(height);
//        System.out.println(ans);
//     Optimize
        int ans = storewater1(height);
        System.out.println(ans);
    }

    private static int storewater1(ArrayList<Integer> height) {
        int left =0;
        int right = height.size()-1;

        int maxwater=0;

        while (left<right){
            int h = Math.min(height.get(left), height.get(right));
            int w = right - left;
            maxwater = Math.max(maxwater, h * w);

            if (height.get(left) < height.get(right)){
                left++;
            }else {
                right--;
            }
        }
        return maxwater;
    }

    private static int storewater(ArrayList<Integer> height) {
        int maxwater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int h = Math.min(height.get(i), height.get(j));
                int w = j - i;
                maxwater = Math.max(maxwater, h * w);
            }
        }
        return maxwater;
    }
}
