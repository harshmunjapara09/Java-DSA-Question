package Stack.Original;

import java.util.Stack;

public class Max_Area_Histrogram {
    public static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};
        System.out.println(Max_Area(height));
    }

    private static int Max_Area(int[] height) {
        int max= Integer.MIN_VALUE;
        int [] nextSmallerLeft = new int[height.length];
        int [] nextSmallerRight = new int[height.length];

        Stack<Integer> stack1 = new Stack<>();
        for (int i = height.length-1; i >=0 ; i--) {
            while (!stack1.empty() && height[stack1.peek()] >= height[i]){
                stack1.pop();
            }
            if (stack1.empty()){
                nextSmallerRight[i]=height.length;
            }else {
                nextSmallerRight[i]=stack1.peek();
            }
            stack1.push(i);
        }

         stack1 = new Stack<>();
        for (int i = 0; i < height.length ; i++) {
            while (!stack1.empty() && height[stack1.peek()] >= height[i]){
                stack1.pop();
            }
            if (stack1.empty()){
                nextSmallerLeft[i]=-1;
            }else {
                nextSmallerLeft[i]=stack1.peek();
            }
            stack1.push(i);
        }

        for (int i = 0; i < height.length; i++) {
            max = Math.max(max,height[i]*(nextSmallerRight[i]-nextSmallerLeft[i]-1));
        }
        return max;
    }
}
