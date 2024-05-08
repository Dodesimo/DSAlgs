package Recursion;

public class mergeSort {

    public static void mergeSort(int[] workSpace, int upperBound, int lowerBound) {

        //If size is 1.
        if (lowerBound == upperBound) return;
        int mid = (lowerBound+upperBound)/2;
        mergeSort(workSpace,upperBound, mid);
        mergeSort(workSpace, mid, lowerBound);
        merge(workSpace, lowerBound, mid, upperBound);


    }

    public static void merge(int[] temporary, int lowerBound, int midBound, int higherBound) {

        //Same principles as nonRecusriveMerge, except working with two arrays (the workspace array and the main array);
        //Merging lower half and top half of two arrays.

    }

}
