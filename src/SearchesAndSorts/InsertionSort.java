package SearchesAndSorts;

import java.util.Arrays;
import java.util.Random;

public class  InsertionSort {

    public static void main (String[] args) {

        Random random = new Random();

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(100);

        }
        int in = 0;

        for (int i = 1; i < array.length; i++) {

            int tempItem = array[i];
            in = i;

            while (in > 0 && array[in-1] >= tempItem) {

                array[in] = array[in-1];
                in--;
            }

            array[in] = tempItem;

            System.out.println(Arrays.toString(array));

        }


    }


}
