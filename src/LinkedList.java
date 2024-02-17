public class LinkedList {

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
        nL.nextItem = first;
        first = nL;

    }

    public Link deleteFirst() {

        Link t = first;
        first = first.nextItem;
        return t;

    }

    public void displayList() {

        System.out.println("List (left to right) -->");

        Link current = first;

        while (current != null) {

            current.displayLink();
            current = current.nextItem;

        }

        System.out.println("");

    }

}
