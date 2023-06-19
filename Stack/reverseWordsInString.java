package Stack;

public class reverseWordsInString {
    public static void main(String[] args) {
        String s = "Hello How are you";
        char[] Stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                while (!isEmpty(top)) {
                    top = pop(Stack, top);
                }
            System.out.print(" ");
            } else {
                top = push(Stack, top, s.charAt(i));
            }
        }
        while (!isEmpty(top)) {
            top = pop(Stack, top);
        }
    }

    private static boolean isEmpty(int top) {
        if (top == -1) {
            return true;
        }
        return false;
    }

    private static int pop(char[] stack, int top) {
        System.out.print(stack[top]);
        top--;
        return top;
    }

    private static int push(char[] stack, int top, char c) {
        top++;
        stack[top] = c;
        return top;
    }
}
