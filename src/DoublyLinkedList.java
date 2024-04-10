public class DoublyLinkedList {

    public DoublyLink first;
    public DoublyLink last;

    public DoublyLinkedList(){

        first = null;
        last = null;

    }

    public boolean isEmpty() {

        return (first == null && last == null);

    }

    public void insertFirst(long dd) {

        DoublyLink newLink = new DoublyLink(dd);

        if (isEmpty()) {

            last = newLink;
            newLink.next = first;
            first = newLink;
            //When empty, make the last link the new link

        } else {

            first.previous = newLink;
            newLink.next = first;
            first = newLink;

        }

    }

    public void insertLast(long dd) {

        DoublyLink newLink = new DoublyLink(dd);

        if (isEmpty()) {

            first = newLink;
            last = newLink;

        } else {

            newLink.previous = last;
            last.next = newLink;
            last = newLink;

        }

    }

    public DoublyLink deleteFirst() {

        DoublyLink temp = first;

        if (first.next == null) {

            last = null;
            first = first.next;

        } else {

            first = first.next;
            first.previous = null;

        }

        return temp;
    }

    public DoublyLink deleteLast() {

        DoublyLink temp = last;

        if (last.previous == null) {

            first = null;
            last = last.previous;

        } else {

            last.previous.next = null;
            last = last.previous;


        }

        return temp;

    }

    public boolean insertAfter(long key, long dd) {

        DoublyLink current = first;

        while (current != null && current.dData != key) {

            current = current.next;

        }

        if (current == null) return false;

        DoublyLink newLink = new DoublyLink(dd);

        if (current.next == null) {

            newLink.previous = current;
            current.next = newLink;
            last = newLink;

        } else {

            newLink.next = current.next;
            newLink.previous = current;
            current.next.previous = newLink;
            current.next = newLink;

        }

        return true;

    }

    public DoublyLink deleteKey (long key) {

        DoublyLink current = first;

        while (current != null && current.dData != key) {

            current = current.next;

        }

        if (current == null) return null;

        if (current == first) {

            first = current.next;

        } else {

            current.previous.next = current.next;

        }

        if (current == last) {

            last = current.previous;

        } else {

            current.next.previous = current.previous;
        }

        return current;
    }

    public void displayForward() {

        System.out.println("List (first --> last)");
        DoublyLink current = first;

        while (current != null) {

            current.displayLink();
            current = current.next;

        }

    }

    public static void main (String args[]) {


        DoublyLinkedList theList = new DoublyLinkedList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);

        theList.displayForward();

        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(11);

        theList.displayForward();

        theList.insertAfter(22, 77);
        theList.displayForward();

    }
}
