package Recursion;

public class raiseToPower {

    public static int raiseToPower(int x, int y) {

        if (y == 1) return x;
        return raiseToPower(x*x, y/2);


    }

    public static void main (String[] args) {

        System.out.println(raiseToPower(2, 4));

    }

}
