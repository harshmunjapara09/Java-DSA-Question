package Recursion.Assignment;

public class product {
    public static void main(String[] args) {
        int x = 4;
        int y = 6;

        System.out.println(productvalues(x,y));
    }

    private static int productvalues(int x, int y) {
        if (y==0){
            return y;
        }

        return x+=productvalues(x,y-1);
    }
}
