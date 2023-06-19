package Stack;

public class Palindrome {
    public static void main(String[] args) {
        String s ="naman";
        int top=-1;
        char [] Stack = new  char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            top = push(Stack,top,s.charAt(i));
        }
       String ans = print(Stack,top);
        System.out.println(ans.equals(s));
    }

    private static String print(char[] stack, int top) {
        StringBuilder s = new StringBuilder();
        while (top!=-1){
            s.append(stack[top]);
            top--;
        }
        return s.toString();
    }
    private static int push(char[] stack, int top, char c) {
        top++;
        stack[top] = c;
        return top;
    }

}
