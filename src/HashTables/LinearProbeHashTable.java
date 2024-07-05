package HashTables;

public class LinearProbeHashTable {

    class DataItem {

        private final int iData;

        public DataItem(int ii) {

            this.iData = ii;

        }

        public int getKey() {

            return iData;

        }

    }

    class HashTable {

        private final DataItem[] hashArray;
        private final int arraySize;
        private final DataItem nonItem;

        public HashTable(int size) {

            this.arraySize = size;
            hashArray = new DataItem[arraySize];
            nonItem = new DataItem(-1);

        }

        public int hashFunction(int key) {

            return key % arraySize;

        }

        public void insert(DataItem item) {

            int key = item.getKey();
            int hashKey = hashFunction(key);

            while (hashArray[hashKey] != null || hashArray[hashKey].getKey() != -1) {

                hashKey++;

                hashKey = hashFunction(hashKey);
            }

            //Once it finds the empty key, go ahead and add it.
            hashArray[hashKey] = item;
        }

        public DataItem delete(int key) {

            int hashKey = hashFunction(key);

            while (hashArray[hashKey] != null) {

                if (hashArray[hashKey].getKey() == key) {

                    DataItem temp = hashArray[hashKey];
                    hashArray[hashKey] = nonItem;
                    return temp;

                }

                hashKey++;
                hashKey = hashFunction(hashKey);


            }

            return null;


        }

        public DataItem find(int key){

            int hashVal = hashFunction(key);

            while (hashArray[hashVal] != null){

                if (hashArray[hashVal].getKey() == key){

                    return hashArray[hashVal];

                }

                hashVal++;
                hashVal %= arraySize;

            }

            return null;
        }




    }


}
