package Recursion;

public class recursiveBinarySearch {

    public int[] a = new int[20];

    public int recursiveBinarySearch(int key, int lowerBound, int higherBound) {

        int currentIndex = (lowerBound + higherBound) / 2;

        if (a[currentIndex] == key) {

            return a[currentIndex];

        } else if (lowerBound > higherBound) {

            return -1;

        } else if (a[currentIndex] > key) {

            return recursiveBinarySearch(key, lowerBound, currentIndex-1);

        } else {

            return recursiveBinarySearch(key, currentIndex+1, higherBound);

        }

    }

}
