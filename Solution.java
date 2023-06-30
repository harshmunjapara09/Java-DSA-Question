class Solution {
    public static void main(String[] args) {
        int num =16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        double ans =  Math.sqrt(num);
        int ans1 = (int)ans;
        if (ans1==ans){
            return true;
        }
        return false;
    }
}