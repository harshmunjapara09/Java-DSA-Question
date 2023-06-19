package Stack;

public class reverseString {
    public static void main(String[] args) {
        String s ="Hello";
        int top=-1;
        char [] Stack = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            top = push(Stack,top,s.charAt(i));
        }
        print(Stack,top);
    }

    private static void print(char[] stack, int top) {
        while (top!=-1){
            System.out.print(stack[top]);
            top--;
        }
    }

    private static int push(char[] stack, int top, char c) {
        top++;
        stack[top]=c;
        return top;
    }
}
