package Heap;

public class Heap {

    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap (int mx) {

        maxSize = mx;
        currentSize = 0;
        heapArray = new Node[maxSize];

    }

    class Node {

        private int iData;

        public Node (int key) {

            iData = key;

        }

        public int getKey() {

            return iData;

        }

        public void setKey(int id) {

            this.iData = id;

        }

    }

    public void trickleDown(int index){

        int largerChild;
        Node top = heapArray[index];

        while (index < currentSize / 2) { //check that the node has at least one child by thresholding the "level"

            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;

            if (rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) {

                largerChild = rightChild;

            } else {

                largerChild = leftChild;
            }

            //check if this loop needs to end;
            if (top.getKey() >= heapArray[largerChild].getKey()) {

                break;

            }

            heapArray[index] = heapArray[largerChild];
            index = largerChild;

        }
        //once the right place is found, place the top
        heapArray[index] = top;


    }

    public boolean insert(int key) {

        if (currentSize == maxSize) {

            return false;

        }

        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize++);
        return true;

    }

    public void trickleUp(int index) {

        int parent = (index - 1) / 2;
        Node bottom = heapArray[index]; //this the node we are tryna trickle up

        while (index > 0 && heapArray[parent].getKey() < bottom.getKey()) {

            heapArray[index] = heapArray[parent]; //move the parent down.
            index = parent;
            parent = (parent - 1) / 2; //essentially move up.

        }

        heapArray[index] = bottom;
    }

    public Node remove() {

        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    public boolean change(int index, int newValue) {

        if (index < 0 || index >= currentSize) {

            return false; //invalid

        }

        int oldValue = heapArray[index].getKey();
        heapArray[index].setKey(newValue);

        if (oldValue < newValue) {

            trickleUp(index);

        } else trickleDown(index);

        return true;
    }


}
