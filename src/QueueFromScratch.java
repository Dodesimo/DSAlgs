public class QueueFromScratch {

    public int maxSize;
    public int front;
    public int back;
    public int[] queue;
    public int numberOfItems;

    public QueueFromScratch(int ms){

        maxSize = ms;
        queue = new int[maxSize];
        front = 0;
        back = 1;

    }

    public void insert(int n) {

        //Wrap around
        if (back == maxSize-1) {

            for (int i = 0; i < front; i++) {

                if (!isOccupied(i)) {

                    queue[i] = n;
                    back = i;
                    break;

                }
            }
        } else {

            queue[back - 1] = n;
            back++;

        }
    }

    public int remove() {

        int numb = queue[front];
        front++;

        if (front == maxSize) {

            front = 0;

        }

        numberOfItems--;

        return numb;

    }

    public int peek() {

        return queue[front];

    }

    public boolean isFull() {

        return (numberOfItems == maxSize);

    }

    public boolean isEmpty() {

        return (numberOfItems == 0);

    }

    public int size() {

        return numberOfItems;

    }

    public boolean isOccupied(int index) {

        if (queue[index] != 0) {

            return true;

        }

        return false;

    }

    public static void main (String args[]) {

        QueueFromScratch q = new QueueFromScratch(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);

        q.remove();
        q.remove();
        q.remove();

        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
    }
}
