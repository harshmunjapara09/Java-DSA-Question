package Stack.Original;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates {
    public static void main(String[] args) {
        String s = "azxxzy";
        System.out.println(remove(s));
    }

    private static String remove(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty()){
                stack.push(s.charAt(i));
            } else if (stack.peek() == s.charAt(i)) {
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }

        return sb.toString();
    }
}
