package Recursion;

public class recursiveTriangularNumbers {

    public static int triangular(int n) {

        if (n == 1) {

            return 1;

        } else {

            return (n + triangular(n-1));

        }

    }

    public static void main (String[] args) {

        System.out.println(triangular(9));;

    }
}
