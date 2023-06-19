package Stack;
public class reverseNumber {
    public static void main(String[] args) {
        int n=1234;
        int m=n;
        int count =0;
        int top=-1;
        while (n!=0){
            count++;
            n/=10;
        }
        int n1=count-1;
        int [] arr = new int[count];
        int [] Stack = new int[arr.length];
        while (m!=0){
            int last = m % 10;
            arr[n1--]=last;

            m/=10;
        }
        for (int i = 0; i < arr.length; i++) {
            top = push(Stack,top,arr[i]);
        }
        print(Stack,top);
    }

    private static void print(int[] stack, int top) {
        int num =0;

       while (top!=-1){
           num = num * 10 + stack[top];
           top--;
       }
        System.out.println(num);
    }

    private static int push(int[] Stack, int top,int value) {
        top++;
        Stack[top]=value;
        return top;
    }
}

//public class reverseNumber {
//    public static void main(String[] args) {
//        int num = 1234;
//        int top=-1;
//        String temp = String.valueOf(num);
//        char[] Stack = new char[temp.length()];
//        for (int i = 0; i < temp.length(); i++) {
//            top = push(Stack,top,temp.charAt(i));
//        }
//        String s =print(Stack,top);
//        int ans = Integer.parseInt(s);
//        System.out.println(ans);
//    }
//
//    private static String print(char[] stack, int top) {
//        StringBuilder s = new StringBuilder();
//        while (top!=-1){
//            s.append(stack[top]);
//            top--;
//        }
//        return s.toString();
//    }
//    private static int push(char[] stack, int top, char c) {
//        top++;
//        stack[top] = c;
//        return top;
//    }
//
//}
