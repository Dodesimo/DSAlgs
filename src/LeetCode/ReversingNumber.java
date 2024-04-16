package LeetCode;

public class ReversingNumber {

    public static void main (String[] args) {

        int number = 123;
        int reverse = 0;

        while (number > 0) {

            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number = number/10;

        }

        System.out.println("Reverse: " + reverse);


    }

}
