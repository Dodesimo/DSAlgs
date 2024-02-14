public class PriorityQueueFromScratch {

    public int maxSize;
    public int[] pqueue;
    public int numberOfItems;

    public PriorityQueueFromScratch(int m) {

        maxSize = m;
        pqueue = new int[maxSize];
        numberOfItems = 0;
    }

    public void insert(int e) {

        if (numberOfItems == 0) {

            pqueue[0] = e;

        } else {

            int i = 0;
            //Suppose front of the queue is lowest, ascending {1, 2, 4, 5, 6}
            for (i = pqueue.length - 1; i > 0; i--) {

                if (e < pqueue[i]) {

                    pqueue[i + 1] = pqueue[i];

                } else {

                    break;

                }
            }

            pqueue[i+1] = e;
        }
    }
}
