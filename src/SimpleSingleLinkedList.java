public class SimpleSingleLinkedList {

    public Link first;

    public void LinkedList() {

        //set the first as null
        first = null;

    }

    public boolean isEmpty() {

        return (first == null);

    }

    public void insertFirst(int i, double d) {

        Link nL = new Link(i, d);
        nL.nextLink = first;
        first = nL;

    }

    public Link deleteFirst() {

        Link t = first;
        first = first.nextLink;
        return t;

    }

    public void displayList() {

        System.out.println("List (left to right) -->");

        Link current = first;

        while (current != null) {

            current.displayLink();
            current = current.nextLink;

        }

        System.out.println("");

    }

    //find an address with a given key

    public Link find (int key) {

        Link current = first;
        Link targetLink = null;

        while (current != null) {

            if (current.iData == key) {

                targetLink = current;
                break;

            }

            current = current.nextLink;

        }

        if (targetLink == null) return null;
        else return targetLink;
    }

    // delete given a key, and return the address
    public Link delete(int k) {

        Link current = first;
        Link previous = first;
        Link target = null;

        while (current != null) {

            if (current.iData == k) {

                target = previous.nextLink;
                previous.nextLink = current.nextLink;
                break;
            }
            previous = current;
            current = current.nextLink;
        }

        if (target == null) return null;
        else return target;

    }

    public static void main (String[] args) {

        SimpleSingleLinkedList s = new SimpleSingleLinkedList();

        s.insertFirst(22, 2.99);
        s.insertFirst(44, 4.99);
        s.insertFirst(66,6.99);
        s.insertFirst(88,8.99);

        Link d = s.delete(101);

        if (d==null) System.out.println("Can't find");
        else System.out.println("found");

    }

}
