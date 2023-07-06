package Stack.Original;

import java.util.Stack;

public class reverseWordusingStack {
    public static void main(String[] args) {
        String s = "How are you Harsh";

        reverseWordStack(s);
    }

    private static void reverseWordStack(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                while (!stack.empty()){
                    char c = stack.pop();
                    ans.append(c);
                }
                ans.append(" ");
            }else {
                stack.push(s.charAt(i));
            }
        }
        while (!stack.empty()){
            char c = stack.pop();
            ans.append(c);
        }
        System.out.println(ans);
    }
}
