package SearchesAndSorts;

public class ShellSort {

    public static void main (String[] args) {

        int inner, outer = 0;
        int nElements = 1000;
        int theArray[] = new int[outer];
        int temp;

        //Figure out greatest value of h;
        int h = 1;
        while (h <= nElements/3) {

            h = h*3 + 1;

        }

        System.out.println(h);
        while (h > 0) {

            for (outer = h; outer < nElements; outer++) {

                temp = theArray[outer];
                inner = outer;

                while (inner > h-1 && theArray[inner-h] >= temp) {

                    theArray[inner] = theArray[inner-h];
                    inner -= h;

                }

                theArray[inner] = temp;

            }

            h = (h-1)/3;

        }

    }
}
