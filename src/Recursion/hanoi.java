package Recursion;

public class hanoi {

    public static void hanoi(int n, int start, int end) {

        if (n == 1){

            move(start,end);

        } else {

            hanoi(n-1, start, 6-(start+end));
            move(start, end);
            hanoi(n-1, 6-(start+end),end);

        }

    }

    public static void move (int p1, int p2) {

        System.out.println(p1 + "->" + p2);

    }

    public static void main (String[] args) {

        hanoi(3, 1, 3);


    }

}
