public class DoubleEndedList {

    public Link first;
    public Link last;

    public void DoubleEndedList() {

        first = null;
        last = null;

    }

    public boolean isEmpty(){

        return (first == null);


    }

    public void insertFirst(int i, double d){

        Link n = new Link(i, d);

        if (isEmpty()) {

            last = n;

        }
            n.nextLink = first;
            first = n;
    }

    public void insertLast(int i, double d) {

        Link n = new Link(i, d);

        if (isEmpty()) {

            first = n;

        } else {

            last.nextLink = n;

        }

        last = n;
    }
    public double deleteFirst() {

        double t = first.dData;

        if (first.nextLink == null) {

            last = null;

        }

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

    public static void main (String args[]) {

        DoubleEndedList e = new DoubleEndedList();
        e.insertFirst(22, 0);
        e.insertFirst(44, 0);
        //e.insertFirst(66, 0);
        e.insertLast(11, 0 );
        e.displayList();
        //e.insertLast(33, 0);
        //e.insertLast(55, 0 );

        //e.deleteFirst();
        //e.deleteFirst();
        //e.displayList();

    }

}
