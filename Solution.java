import java.math.BigInteger;

class Solution {
    public static void main(String[] args) {
        String num1 = "2", num2 = "3";
        System.out.println(multiply(num1,num2));
    }
    public static String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        BigInteger n3 = n1.multiply(n2);

        return String.valueOf(n3);
    }
}