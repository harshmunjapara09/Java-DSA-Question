package Stack.Original;

import java.util.Stack;

public class  validateParantheses {
    public static void main(String[] args) {
        String s = ")";

        boolean ans = isvalid(s);
        System.out.println(ans);
    }
    private static boolean isvalid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()){
                    return false;
                }
                if ((stack.peek()=='(' && s.charAt(i)==')') || (stack.peek()=='{' && s.charAt(i)=='}') || (stack.peek()=='[' && s.charAt(i)==']')){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
