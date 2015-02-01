/* Cracking the coding interview
 * Pre-work 
 * Implement a Hash Table
 *
 * Method: Basic Hash
 */

publiva class HashTable {
    private final static tableSize = 256;
    HashEntry[] table;
    public HashTable() {
        if(table == null) {table = new HashEntry[tableSize];}
        for(int i = 0; i < tableSize; i++) {
            table[i] = null;
        }
    }

    public int getValue(int key) {
        int hashIndex = key % tableSize;
        while(table[hashIndex] != null && table[hashIndex].getKey() != key ) {
            hashIndex = (hashIndex + 1) % tableSize;
        }
        // hashIndex not chekced outofbound?
        if(table[hashIndex] == null) {
            return -1;
        } else {
            return table[hashIndex].getValue();
        }
    }

    public int putHash(int key, int value) {
        int hashIndex = key % tableSize;
        while(table[hashIndex] != null && table[hashIndex].getKey() != key) {
            hashIndex = (hashIndex + 1) % tableSize;
        }
        table[hashIndex] = new HashEntry(key, value);
    }
}

public class HashEntry {
    private int key;
    private int value;

    public HashEntry(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

}


/*
 * Extension:
 * APIs: 
 * Note: 
 */