package Stack;

public class reverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int top=-1;
        String temp = String.valueOf(num);
        char[] Stack = new char[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            top = push(Stack,top,temp.charAt(i));
        }
        String s =print(Stack,top);
        int ans = Integer.parseInt(s);
        System.out.println(ans);
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
