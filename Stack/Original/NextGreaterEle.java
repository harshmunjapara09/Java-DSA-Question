package Stack.Original;

import java.util.Stack;

public class NextGreaterEle {
    public static void main(String[] args) {
        int[] arr = {10,20,10,30,5};
        int[] next = new int[arr.length];
        nextgreater(arr,next);
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i] + " ");
        }
    }

    private static void nextgreater(int[] arr, int[] next) {
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >=0; i--) {
            while (!s.empty() && arr[s.peek()] <= arr[i]){
                if (s.peek() <= arr[i]){
                    s.pop();
                }
            }
            if (s.empty()){
                next[i] = -1;
            }else {
                next[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }
}
