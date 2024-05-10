package SearchesAndSorts;

public class basicPartition {

    public int partitionIt(int left, int right, long pivot) {

        int[] partitionArray = {};

        //set left pointer to the left of the first index number
        int leftPtr = left - 1;

        //set right pointer to the right of the end index number;
        int rightPtr = right + 1;

        while (true) {

            //while the pointer doesn't go past the array and ur actual value is less than the pivot, increment left.
            while (leftPtr < right && partitionArray[left++] < pivot) {
            }

            //same logic for the right
            while (rightPtr > left && partitionArray[right--] > pivot) {
            }

            //check if left pointer is greater than right pointer (indicates overlap)
            if (leftPtr >= rightPtr) break;
            else {

                //if not, swap
                swap(left, right);


            }
        }

        return leftPtr;

    }

        public void swap(int a, int b) {

        //stereotypical swap algorithm;

        }



    }


}
