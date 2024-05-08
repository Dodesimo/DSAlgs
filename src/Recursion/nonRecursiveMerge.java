package Recursion;

public class nonRecursiveMerge {

    public static void main(String[] args) {

        int[] arrayA = new int[]{23, 47, 81, 95};
        int[] arrayB = {7, 14, 39, 55, 62, 74};
        int[] arrayC = new int[10];

        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;

        while (aIndex < arrayA.length && bIndex < arrayB.length) {

            if (arrayA[aIndex] < arrayB[bIndex]) {

                arrayC[cIndex++] = arrayA[aIndex++];

            } else {

                arrayC[cIndex++] = arrayB[bIndex++];

            }

            //if array b is empty and array a still has elements in it.
            while (aIndex < arrayA.length) {

                arrayC[cIndex++] = arrayA[aIndex++];

            }

            //if array a is empty and array b still has elements in it.
            while (bIndex < arrayB.length) {

                arrayC[cIndex++] = arrayB[bIndex++];

            }

        }

    }
}
