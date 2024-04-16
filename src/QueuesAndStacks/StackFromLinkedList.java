package QueuesAndStacks;

public class StackFromLinkedList {

    public SimpleSingleLinkedList sl;

    public StackFromLinkedList() {

        sl = new SimpleSingleLinkedList();

    }

    public void push(double j){

        sl.insertFirst(0, j);

    }
    public double pop () {

        Link link = sl.delete(0);
        return link.dData;

    }
    public boolean isEmpty(){

        return sl.isEmpty();

    }
    public void displayStack() {

        sl.displayList();

    }



}
