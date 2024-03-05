public class QueueFromLinkedList {

    public DoubleEndedList dl;

    public QueueFromLinkedList() {

        dl = new DoubleEndedList();

    }

    public void insert(double j) {

        //LIFO
        dl.insertLast(0,j);

    }
    public boolean isEmpty() {

        return dl.isEmpty();

    }
    public double remove() {

        return dl.deleteFirst();

    }

    public void displayQueue(){

        dl.displayList();

    }

}
