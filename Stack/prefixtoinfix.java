package Stack;

public class prefixtoinfix {
    public static void main(String[] args) {
        String prefix = "*+ab/+cd3";
        String[] Stack = new String[10];
        int top = -1;
        for (int i = prefix.length() - 1; i >= 0; i--) {
            if (prefix.charAt(i) == '*' || prefix.charAt(i) == '/' || prefix.charAt(i) == '+' || prefix.charAt(i) == '-') {
                String left = peek(Stack, top);
                top = pop(top);
                String right = peek(Stack, top);
                top = pop(top);

                String ans = "(" + left + prefix.charAt(i) + right + ")";
                top = push(Stack, top, ans);

            } else {
                top = push(Stack, top, String.valueOf(prefix.charAt(i)));
            }
        }
        System.out.println(Stack[top]);
    }

    private static int pop(int top) {
        top--;
        return top;
    }

    private static String peek(String[] stack, int top) {
        return stack[top];
    }


    private static int push(String[] stack, int top, String s) {
        top++;
        stack[top] = s;
        return top;
    }


}
