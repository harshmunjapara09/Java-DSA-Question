package Stack;

public class Postfixtoinfix {
    public static void main(String[] args) {
        String postfix = "ab+cd-*4/";
        String[] Stack = new String[10];
        int top=-1;
        for (int i = 0; i < postfix.length(); i++) {
            if (postfix.charAt(i)=='*' || postfix.charAt(i)=='/' || postfix.charAt(i)=='+' || postfix.charAt(i)=='-'){
                String left = peek(Stack,top);
                top = pop(top);
                String right = peek(Stack,top);
                top = pop(top);

                String ans = "(" + right + postfix.charAt(i) + left + ")";
                top = push(Stack,top,ans);

            }else {
                top = push(Stack,top,String.valueOf(postfix.charAt(i)));
            }
        }
        System.out.println(Stack[top]);
    }

    private static int pop(int top) {
        top--;
        return top;
    }

    private static String peek(String[] stack,int top) {
        return stack[top];
    }

    private static int push(String[] stack, int top, String s) {
        top++;
        stack[top]=s;
        return top;
    }
}
