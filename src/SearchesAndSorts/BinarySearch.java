package SearchesAndSorts;

public class BinarySearch {

    public static void main(String[] args) {

     int[] orderedArray = new int[5];
     orderedArray[0] = 1;
     orderedArray[1] = 2;
     orderedArray[2] = 3;
     orderedArray[3] = 4;
     orderedArray[4] = 5;


     int lower = 0;
     int higher = orderedArray.length-1;
     int target = 7;

     while (true) {

         int current = (lower + higher)/2;

         if (orderedArray[current] == target) {

             System.out.println(current);
             break;

         } else if (lower > higher) {

             System.out.println(orderedArray.length);
             break;

         }  else {

             if (target > orderedArray[current]) {

                 lower = current + 1;

             } else if (target < orderedArray[current]) {

                 higher = current - 1;

             }
         }
     }
    }
}
