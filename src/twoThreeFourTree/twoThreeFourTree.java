package twoThreeFourTree;

class DataItem {

    public long dData;

    public DataItem(long dd) {

        this.dData = dd;

    }

    public void displayItem() {

        System.out.println("/" + dData);


    }

}

class Node {

    //How many children max a node can have.
    private static final int ORDER = 4;
    private final Node[] childArray = new Node[ORDER];
    private final DataItem[] itemArray = new DataItem[ORDER - 1];
    private int numItems;
    private Node parent;

    public void connectChild(int childNum, Node child) {

        childArray[childNum] = child;

        //If the child actually has something, set its parent as the node you are linking it to.
        if (child != null) child.parent = this;

    }

    public Node disconnectChild(int childNum) {

        Node tempNode = childArray[childNum];

        //set node as empty
        childArray[childNum] = null;
        return tempNode;


    }

    public Node getChild(int childNum) {

        return childArray[childNum];

    }

    public Node getParent() {
        return parent;
    }

    public boolean isLeaf() {

        //Why only check the first entry of the array?
        return childArray[0] == null;

    }

    public int getNumItems() {

        //Why isn't this being incremented?
        return numItems;

    }

    public DataItem getItem(int index) {

        return itemArray[index];

    }

    public boolean isFull() {

        return (numItems == ORDER - 1);

    }

    public int findItem(long key) {


        for (int j = 0; j < ORDER - 1; j++) {

            if (itemArray[j].dData == key) return j;
            else if (itemArray[j] == null) break;

        }

        return -1;

    }

    public int insertItem(DataItem newItem) {

        //Add one more to the number of items present and get key of the new item.
        numItems++;
        long newKey = newItem.dData;

        for (int j = ORDER - 2; j >= 0; j--) {

            //If where we are null, keep going.
            if (itemArray[j] == null) continue;
            else {

                long presentKey = itemArray[j].dData;
                //If the newKey is less than where we are.
                if (newKey < presentKey) {

                    //Needs to shift right.
                    itemArray[j + 1] = itemArray[j];

                } else {

                    //Once we hit something less than the new key, add new key in place thats one position greater.
                    itemArray[j + 1] = newItem;
                    return j + 1;

                }
            }
        }

        //Edge case where new item needs to be placed in the first position.
        itemArray[0] = newItem;
        return 0;

    }

    public DataItem removeItem() {

        DataItem temp = itemArray[numItems - 1];
        itemArray[numItems - 1] = null;
        numItems--; //reduce the number of items.
        return temp;

    }

    public void displayNode() {

        for (int j = 0; j < numItems; j++) {

            itemArray[j].displayItem();

        }

        System.out.println("/");

    }

}


public class twoThreeFourTree {

    private Node root = new Node();

    public int find(long key) {

        Node curNode = root;
        int childNumber;

        while (true) {

            //Found the number because childNumber is not equal to -1.
            if ((childNumber = curNode.findItem(key)) != -1) return childNumber;
            else if (curNode.isLeaf()) return -1; //(can't find it but cannot go deeper either).
            else curNode = getNextChild(curNode, key);  //get next node to search.

        }

    }

    public void insert(long dValue) {

        Node curNode = root;
        DataItem tempItem = new DataItem(dValue);

        while (true) {

            if (curNode.isFull()) {

                split(curNode);
                curNode = curNode.getParent();
                curNode = getNextChild(curNode, dValue);

            } else if (curNode.isLeaf()) break; //just insert.

            else {
                curNode = getNextChild(curNode, dValue);
            } //go lower.
        }
        curNode.insertItem(tempItem);

    }

    public void split(Node thisNode) {

        DataItem itemB, itemC;
        Node parent, child2, child3;
        int itemIndex;

        itemC = thisNode.removeItem();
        itemB = thisNode.removeItem();     //this is the order, because it deletes starting from the right.
        child2 = thisNode.disconnectChild(2);
        child3 = thisNode.disconnectChild(3);

        Node newRight = new Node(); //sibling node.

        if (thisNode == root) {

            root = new Node();
            parent = root;
            root.connectChild(0, thisNode);

        } else {

            parent = thisNode.getParent(); //get parent.


        }

        itemIndex = parent.insertItem(itemB); //insert item
        int n = parent.getNumItems();

        for (int j = n - 1; j > itemIndex; j--) {

            Node temp = parent.disconnectChild(j);
            parent.connectChild(j + 1, temp); //why are we shifting all the parent's connections one child to the right?


        }

        //Add newright to parent

        parent.connectChild(itemIndex+1, newRight);


       //add itemC to new right.
        newRight.insertItem(itemC);
        newRight.connectChild(0, child2);
        newRight.connectChild(1, child3);
    }

    public Node getNextChild(Node theNode, long theValue){

        int j;

        int numItems = theNode.getNumItems();

        for (j = 0; j<numItems; j++) {

            if (theValue < theNode.getItem(j).dData) return theNode.getChild(j);
        }

        return theNode.getChild(j);                                            // don't get th epoint of htis.


    }

}