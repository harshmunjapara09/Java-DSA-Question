package Stack.Original;

import java.util.Stack;

public class checkDuplicatePara {
    public static void main(String[] args) {
        String s = "((a+b)+(c+r))";
        System.out.println(check(s));
    }

    private static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                int count = 0;
               while (stack.peek()!='('){
                   stack.pop();
                   count++;
               }
                if (count < 1){
                    return true;
                }
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return false;
    }
}
