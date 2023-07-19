import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[][] grid = {
                {-15,1,3},
                {15,7,12},
                {5,6,-2}};
        System.out.println(Arrays.toString(findColumnWidth(grid)));
    }

    public static int[] findColumnWidth(int[][] grid) {
        int [] arr = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < grid.length; j++) {
                String col = String.valueOf(grid[j][i]);
                int len = col.length();
                max = Math.max(len,max);
            }
            arr[i]=max;
        }
        return arr;
    }
}