package SearchesAndSorts;

import java.util.Random;
import java.util.*;
public class BubbleSort {

    public static Random random = new Random();

    public static void main (String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(100);

        }

        array[4] = 1001;

        int temp = 0;

        for (int i = 0; i < array.length-1; i++) {
            for (int j = array.length-1; j > i; j--) {
                if(array[j] > array[j-1]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }


            }

            System.out.println(Arrays.toString(array));
        }



    }

}
