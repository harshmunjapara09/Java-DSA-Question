package Stack.Original;

import java.util.Stack;

public class palindromeusingStack {
    public static void main(String[] args) {
        String s = "naman1";

        System.out.println( palindrome(s));
    }

    private static boolean palindrome(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.empty()){
            char c = stack.pop();
            sb.append(c);
        }
        return s.equals(sb.toString());
    }
}
