package Stack;

import java.util.Stack;

public class reverseinMemoryStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        printStack(s);
        reverseinMemory(s);
        printStack(s);
    }

    private static void reverseinMemory(Stack<Integer> s) {
        if (s.empty()){
            return;
        }
        int top = s.pop();
        reverseinMemory(s);
        pushBottomofStack.pushBottom(s,top);
    }

    private static void printStack(Stack<Integer> s) {
        while (!s.empty()){
            System.out.println(s.pop());
        }
    }
}
