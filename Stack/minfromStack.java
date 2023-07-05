package Stack;

public class minfromStack {
    static int[] mainStack = new int[5];
    static int mainTop = -1;
    static int[] minimumStack = new int[5];
    static int minimumTop = -1;

    public static void main(String[] args) {
        pushinStack(15);
        pushinStack(20);
        pushinStack(11);
        pushinStack(5);
        pushinStack(12);
        System.out.println(getmin());
        popfromStack();
        popfromStack();
        System.out.println(getmin());

    }

    private static void pushinStack(int value) {
        pushMain(value);

        if (isEmpty(minimumTop)) {
            pushMinimum(value);
        }
        if (peekMinimum() > value) {
            pushMinimum(value);
        }
    }

    private static void popfromStack() {
        int value = peekMain();
        popMain();
        if (peekMinimum() == value) {
            popMinimum();
        }
    }

    private static void popMinimum() {
        minimumTop--;
    }

    private static void popMain() {
        mainTop--;
    }

    private static int peekMinimum() {
        return minimumStack[minimumTop];
    }

    private static int peekMain() {
        return mainStack[mainTop];
    }


    private static void pushMain(int value) {
        mainTop++;
        mainStack[mainTop] = value;
    }

    private static void pushMinimum(int value) {
        minimumTop++;
        minimumStack[minimumTop] = value;
    }

    private static int getmin() {
        return minimumStack[minimumTop];
    }

    private static boolean isEmpty(int minimumTop) {
        if (minimumTop == -1) {
            return true;
        }
        return false;
    }


}
