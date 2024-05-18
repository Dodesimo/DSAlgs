package SearchesAndSorts;

public class quickSort {

    public static void recursiveQuickSort(int left, int right) {

        //if the size of the subarray is 1 you're done
        if (right - left <= 0) return;
        else {

            //get the partition value
            int partition = partition(left, right, left);
            recursiveQuickSort(left, partition-1);
            recursiveQuickSort(partition+1, right);



        }


    }

    //hardset the right most element as the pivot
    public static int partition(int left, int right, int pivot) {

        //basic partition algorithm made in basicPartition.java.
        int partition = 0;
        return partition;

        //in algorithm: after partition is done (only accounting for right - 1 elements, rightmost element is swapped with element at left pointer (lowest element in the right most subarray)
    }

}
