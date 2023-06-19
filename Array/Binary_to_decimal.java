
public class Binary_to_decimal {
    public static void main(String[] args) {
        bintodecnum(100010110);
    }
    public static void bintodecnum(int n){
        int dec  =  0;
        int power = 0;

        while (n!=0){
            int last  = n % 10 ;
             dec  = dec + (last * (int)Math.pow(2,power));
             n  = n/10;
             power++;
        }
        System.out.println(dec);

    }
}
