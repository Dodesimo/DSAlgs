package LinkedLists;

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

    public static void main (String[] args) {

        QueueFromLinkedList l = new QueueFromLinkedList();

        l.insert(20);
        l.insert(40);

        l.displayQueue();

        l.insert(60);
        l.insert(80);

        l.displayQueue();

        l.remove();
        l.remove();

        l.displayQueue();

    }

}
