package Stack;

import java.util.Stack;

public class PosttoInfixExtracation {
    public static void main(String[] args) {
        String s = "63*12+-     ";
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/') {
                String op = String.valueOf(s.charAt(i));
                String left = stack.pop();
                String right = stack.pop();
                int one = Integer.parseInt(left);
                int two = Integer.parseInt(right);
                int fun =0;
                if (s.charAt(i)=='+'){
                    fun  = two + one;
                } else if (s.charAt(i)=='-') {
                    fun = two - one;
                }else if (s.charAt(i)=='*'){
                    fun = two * one;
                }else {
                    fun = two / one;
                }

                stack.push(String.valueOf(fun));
            }else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
