package HashTables;

public class hashChain {

    //Class for all chain links inside the table.
    class Link {

        public Link next;
        private final int iData;

        public Link(int it) {

            iData = it;

        }

        public int getKey() {

            return iData;

        }

        public void displayLink() {

            System.out.println(iData + " ");

        }

    }

    class SortedList {

        private Link first;

        public void SortedList() {

            first = null;

        }

        public void insert(Link theLink) {

            int key = theLink.getKey();
            Link previous = null;
            Link current = first;

            while (current != null) {

                if (previous.getKey() > key) {

                    break;
                }

                previous = current;
                current = current.next;

            }

            if (previous == null) {

                first = theLink;
                theLink.next = current;

            } else {


                previous.next = theLink;
                theLink.next = current;
            }
        }

        public void delete(int key) {

            Link previous = null;
            Link current = first;

            while (current != null && current.getKey() != key) {

                previous = current;
                current = current.next;

            }

            if (previous == null){

                first = first.next;

            } else {

                previous.next = current.next;

            }

        }

        public Link find(int key) {

            Link current = first;

            while (current != null) {

                if (current.getKey() == key) return current;
                current = current.next;

            }

            return null;

        }


    }

    class HashTable {

        private SortedList[] hashArray;
        private int arraySize;

        public HashTable (int size) {

            arraySize = size;
            hashArray = new SortedList[arraySize];
            for (int j = 0; j < arraySize; j++) {

                hashArray[j] = new SortedList();

            }

        }

        public int hashFunc(int key) {

            return key % arraySize;

        }

        public void insert (Link theLink) {

            int key = theLink.getKey();
            int hashVal = hashFunc(key);
            hashArray[hashVal].insert(theLink);


        }

        public void delete (int key) {

            int hashVal = hashFunc(key);
            hashArray[hashVal].delete(key);

        }

        public Link find(int key) {

            int hashVal = hashFunc(key);
            return hashArray[hashVal].find(key);

        }

    }
}
