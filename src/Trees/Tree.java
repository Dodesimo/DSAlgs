package Trees;

public class Tree {

    private Node root;

    public Node find(int key) {

        Node current = root;

        while (current.iData != key) {

            //if the key is smaller than where I currently am, I need to go to the left (which is smaller)
            if (current.iData > key) {

                current = current.lNode;

                //if the key is larger than where I currently am, I need to go to the right to find it (right is going to be bigger)
            } else if (current.iData < key) {

                current = current.rNode;


            } else {

                return null;

            }

        }

        return current;

    }

    public void insert(int id, double dd) {

        //Make a new node.
        Node newNode = new Node();

        //Set data
        newNode.iData = 2;
        newNode.dData = 2.0;

        //If the tree is empty.
        if (root == null) root = newNode;
        else {

            //Two node approach because you need to know the parent node.
            Node current = root;
            Node parent;

            while (true) {

                parent = current;

                //go left because
                if (id < current.iData) {

                    current = current.lNode;

                    //check if you reached the bottom of the tree
                    if (current == null) {

                        //set where the new node will be.
                        parent.lNode = newNode;
                        return;

                    }


                } else {

                    current = current.rNode;
                    if (current == null) {

                        //set where the new node will be.
                        parent.rNode = newNode;
                        return;

                    }


                }


            }


        }

    }

    public boolean delete(int id) {

        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (current.iData != id) {

            parent = current;

            if (id < current.iData) {

                current = current.lNode;
                isLeftChild = true;

            } else {

                current = current.rNode;
                isLeftChild = false;

            }

            if (current == null) {
                return false;
            }

        }

        if (current.lNode == null && current.rNode == null) {
            if (current == root) root = null;
            else if (isLeftChild) parent.lNode = null;
            else parent.rNode = null;

            //right node doesnt exist, so only l node exists
        } else if (current.rNode == null) {
            if (current == root) {

                root = current.lNode;

            } else if (isLeftChild) {

                parent.lNode = current.lNode;

            } else {

                parent.rNode = current.lNode;

            }
            //left node doesn't exist, so only a right immediate child node and subsequent nodes exist.
        } else if (current.lNode == null) {

            if (current == root){

                root = current.rNode;

            } else if (isLeftChild) {

                parent.lNode = current.rNode;

            } else {

                parent.rNode = current.rNode;

            }


        }


    }

    public void inOrder(Node localRoot) {

        if (localRoot == null) return;

        inOrder(localRoot.lNode);
        System.out.println(localRoot);
        inOrder(localRoot.rNode);


    }


}
