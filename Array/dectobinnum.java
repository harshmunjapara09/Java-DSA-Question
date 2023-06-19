public class dectobinnum {
    public static void main(String[] args) {
            dectobin(2);
    }
    public static void dectobin(int n){
        int binNum=0;
        int power = 0;

        while (n!=0){
            int rem  = n % 2 ;
            binNum  = binNum + (rem * (int)Math.pow(10,power));
            power++;
            n = n/2;
        }
        System.out.println(binNum);
    }
}
