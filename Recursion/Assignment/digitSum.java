package Recursion.Assignment;

public class digitSum {
    static int sum = 0;

    public static void main(String[] args) {
        int n = 5655;
        sum(n);
        System.out.println(sum);
    }

    private static void sum(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum += rem;
        n = n / 10;
        sum(n);
    }
}
