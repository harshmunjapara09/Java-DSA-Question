package Stack.Original;

import java.util.Stack;

public class spanStock {
    public static void main(String[] args) {
        int[] stock = {100,80,60,70,60,85,100};
        int[] span = new int[stock.length];

        stockspan(stock,span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] +" ");
        }
    }

    private static void stockspan(int[] stock, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);

        for (int i = 1; i < stock.length ; i++) {
            int curr = stock[i];
            while (!s.empty() && curr > stock[s.peek()]){
                s.pop();
            }
            if (s.empty()){
                span[i]=i+1;
            }else {
                int prehigh = s.peek();
                span[i] = i - prehigh;
            }

            s.push(i);
        }

    }
}
