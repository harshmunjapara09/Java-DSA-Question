package Stack;
class Stack1 {
    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;

        top = push(stack,top,10);
        top = push(stack,top,20);
        top = push(stack,top,30);
        top = push(stack,top,40);
        display(stack,top);
        System.out.println(peek(stack,top));
        top = pop(top);
        display(stack,top);
        System.out.println();
        System.out.println("Insert in Stack");
        top = push(stack,top,50);
        display(stack,top);
        System.out.println();
        System.out.println("Is Empty ? "+isEmpty(top));
        System.out.println(size(top));
    }

    private static int size(int top) {
        if (top==-1){
            System.out.println("Stack is Empty");
            return top;
        }
        return top+1;
    }

    private static boolean isEmpty(int top) {
        if (top==-1){
            return true;
        }
        return false;
    }

    private static int pop(int top) {
        if (top==-1){
            System.out.println("Stack is Empty");
            return top;
        }
        top--;
        return top;

    }

    private static int peek(int[] stack, int top) {
        if (top==-1){
            System.out.println("Stack is Empty");
            return top;
        }
        System.out.println();
        System.out.println("Now peek the topest value in stack");
        return stack[top];
    }

    private static void display(int[] stack, int top) {
        if (top==-1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Display value of Stack");
        while (top!=-1){
            System.out.print(stack[top] + " ");
            top--;
        }
    }

    private static int push(int[] stack, int top,int value) {
        if (top==stack.length-1){
            System.out.println("Stack Overflow");
            return top;
        }
        top++;
        stack[top]= value;
        return top;
    }

}
