package Stack.Original;

import java.util.Stack;

public class prefixtoinfixisusingStack {
    public static void main(String[] args) {
        String s = "/*+ab*ab2";

        System.out.println(prefixtoinfixStack(s));
    }

    private static String prefixtoinfixStack(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
                String left = stack.pop();
                String right = stack.pop();
                String ans = "(" + left +s.charAt(i)+ right + ")";
                stack.push(ans);

            }else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        return stack.peek();
    }
}
