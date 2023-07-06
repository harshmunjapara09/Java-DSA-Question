package Stack.Original;

import java.util.Stack;

public class postfixtoinfixusingStack {
    public static void main(String[] args) {
        String s = "ab+ab**2/";

        System.out.println(postfixtoinfixStack(s));
    }

    private static String postfixtoinfixStack(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
                String left = stack.pop();
                String right = stack.pop();
                String ans = "(" + right +s.charAt(i)+ left + ")";
                stack.push(ans);

            }else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        return stack.peek();
    }
}
