public class DoublyLink {

    public long dData;
    public DoublyLink previous;
    public DoublyLink next;

    public DoublyLink(long d) {

        dData = d;

    }

    public void displayLink() {

        System.out.print(dData + " ");

    }

}
