package Recursion;

public class Pattern {
    public static void main(String[] args) {
//        triagle(4, 0);
        triagle2(4,0);
    }
    public static void triagle2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            triagle2(row, col + 1);
        } else {
            System.out.println();
            triagle2(row - 1, 0);
        }
    }
    public static void triagle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            triagle(row, col + 1);
            System.out.print("*");
        } else {
            triagle(row - 1, 0);
            System.out.println();
        }
    }
}
