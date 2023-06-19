package Stack;

public class middle_ele_delete {
    public static void main(String[] args) {
        String s = "Harsh";
        int top = -1;
        char[] Stack = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            top = push(Stack, top, s.charAt(i));
        }
        top = pop(Stack, top);
        print(Stack, top);
    }

    private static void print(char[] stack, int top) {
        while (top != -1) {
            System.out.print(stack[top] + " ");
            top--;
        }
    }

    private static int pop(char[] stack, int top) {
        int temp = top / 2;
        for (int i = temp; i < stack.length - 1; i++) {
            stack[i] = stack[i + 1];
        }
        top--;
        return top;
    }

    private static int push(char[] stack, int top, char c) {
        top++;
        stack[top] = c;
        return top;
    }

}
