package Recursion;

import java.util.Scanner;

public class nthTriangularNumberNormally {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;


        while (n > 0) {

            sum += n;
            n = n - 1;

        }

        System.out.println(sum);

    }


}
