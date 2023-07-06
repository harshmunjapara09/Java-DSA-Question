package Stack.Original;

import java.util.Stack;

public class minfromStack {
    public static void main(String[] args) {
        Stack<Integer> main = new Stack<>();
        Stack<Integer> min = new Stack<>();

        pushinStack(main,min,10);
        pushinStack(main,min,20);
        pushinStack(main,min,5);
        pushinStack(main,min,12);
        System.out.println(min.peek());
        popfromStack(main,min);
        popfromStack(main,min);
        System.out.println(min.peek());
    }

    private static void popfromStack(Stack<Integer> main, Stack<Integer> min) {
        int value = main.pop();

        if (min.peek() == value){
            min.pop();
        }
    }

    private static void pushinStack(Stack<Integer> main, Stack<Integer> min,int value) {
        main.push(value);

        if (min.empty()){
            min.push(value);
        }
        if (min.peek() > value){
            min.push(value);
        }
    }
}

