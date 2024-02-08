import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(100);

        }

        System.out.println(Arrays.toString(array));

        int minValue = array[0];
        int swapIndex = 0;
        int temp = 0;

        for (int i = 0; i < array.length-1; i++) {

            minValue = array[i];

            //Find min
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < minValue) {

                    minValue= array[j];
                    swapIndex = j;
                }
            }

            //Swap
            temp = array[i];
            array[i] = array[swapIndex];
            array[swapIndex] = temp;

            System.out.println(Arrays.toString(array));
        }
    }
}
