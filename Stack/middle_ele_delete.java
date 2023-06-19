package Stack;

public class middle_ele_delete {
    public static void main(String[] args) {
        int n = 123456;
        int m = n;
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        int[] arr = new int[count];
        int i = 0;
        while (m != 0) {
            int last = m % 10;
            arr[i] = last;
            i++;
            m /= 10;
        }

        int top = -1;
        int[] Stack = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            top = push(Stack, top, arr[j]);
        }

        print(Stack, top);

    }

    private static void print(int[] stack, int top) {
        int mid = stack[top / 2];
        int num = 0;
        while (top != -1) {
            if (stack[top] != mid) {
                num = num * 10 + stack[top];
            }
            top--;
        }
        System.out.println(num);
    }

    private static int push(int[] stack, int top, int value) {
        top++;
        stack[top] = value;
        return top;
    }
}

//public class middle_ele_delete {
//    public static void main(String[] args) {
//        String s = "Harsh";
//        int top = -1;
//        char[] Stack = new char[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            top = push(Stack, top, s.charAt(i));
//        }
//        top = pop(Stack, top);
//        print(Stack, top);
//    }
//
//    private static void print(char[] stack, int top) {
//        while (top != -1) {
//            System.out.print(stack[top] + " ");
//            top--;
//        }
//    }
//
//    private static int pop(char[] stack, int top) {
//        int temp = top / 2;
//        for (int i = temp; i < stack.length - 1; i++) {
//            stack[i] = stack[i + 1];
//        }
//        top--;
//        return top;
//    }
//
//    private static int push(char[] stack, int top, char c) {
//        top++;
//        stack[top] = c;
//        return top;
//    }
//
//}
