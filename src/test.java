import java.util.Arrays;

public class test {

    public static void main (String[] args) {

        int[] pqueue = {1, 2, 4, 5, 6, 0};
        int e = 3;

        int i = 0;
        // Move one up
        for (i = pqueue.length-2; i > 0; i--) {

            if (e > pqueue[i]) {

                pqueue[i-1] = pqueue[i];

            }

        }

        pqueue[i+1] = e;

        System.out.println(Arrays.toString(pqueue));

    }


}
