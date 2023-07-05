package Stack;
import java.util.Stack;
public class reverseStringStack {
    public static void main(String[] args) {
        String s = "abc";
        String ans = reverse(s);
        System.out.println(ans);
    }

    private static String reverse(String s) {
        Stack<Character> stack= new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            char c = stack.pop();
            sb.append(c);
        }
        return sb.toString();
    }

}
