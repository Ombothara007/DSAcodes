package BITMANI;

public class power {

    public static boolean isPower(int n) {
        // A power of 2 has only one bit set in binary
        // So, n > 0 and (n & (n-1)) == 0
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPower(16));  // true
        System.out.println(isPower(18));  // false
        System.out.println(isPower(1));   // true
        System.out.println(isPower(0));   // false
    }
}
