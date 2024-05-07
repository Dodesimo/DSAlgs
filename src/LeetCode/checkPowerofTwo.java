package LeetCode;

public class checkPowerofTwo {

    public static boolean isPowerOfTwo(int n) {

        if (n % 2 == 1) {

            return false;

        } else if (n % 2 == 0) {

            return true;

        }

        return isPowerOfTwo(n/2);

    }

    public static void main(String[] args) {

        boolean isPower = isPowerOfTwo(36);
        System.out.println(isPower);

    }

}
