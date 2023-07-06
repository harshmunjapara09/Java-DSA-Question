package Stack.Original;

import java.util.Stack;

public class prefixtopostfixusingStack {
    public static void main(String[] args) {
        String s ="/*+ab*ab2";
        System.out.println("Postfix : " + prefixtopostfixStack(s) );
    }

    private static String prefixtopostfixStack(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i)=='-' || s.charAt(i)=='+' || s.charAt(i)=='*' || s.charAt(i)=='/'){
                String left = stack.pop();
                String right = stack.pop();
                String ans = left+right+s.charAt(i);
                stack.push(ans);
            }else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        return stack.peek();
    }
}
