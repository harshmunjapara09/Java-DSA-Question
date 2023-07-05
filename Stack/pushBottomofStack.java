package Stack;

import java.util.Stack;

public class pushBottomofStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        int value= 40;

        pushBottom(s,value);
        while (!s.empty()){
            System.out.println(s.pop());
        }
    }

    public static void pushBottom(Stack<Integer> s, int value) {
        if (s.empty()){
            s.push(value);
            return;
        }
        int top = s.pop();
        pushBottom(s,value);
        s.push(top);
    }


}
