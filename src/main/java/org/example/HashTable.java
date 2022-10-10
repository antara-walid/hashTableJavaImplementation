package org.example;

public class HashTable <T>{
    Cell[] hashTableArray ;
    int size ;

    // constructor
    public HashTable(int size) {
        this.size = size;
        hashTableArray = new Cell[size];

        // initializing the cells

        for(int i = 0 ; i <size ; i++)
        {
            hashTableArray[i] = new Cell();
        }

    }

    // hash methode in this case %size
    int getHash(int key)
    {
        return key%size;
    }

    // put methode

    public void put(int key , Object value)
    {
        int hashedIndex = getHash(key);

        Cell indexedCell = hashTableArray[hashedIndex];

        //  creating the cell
        Cell newCell = new Cell(key, value);

        // adding the new cell to the linked list

        newCell.next = indexedCell.next;
        indexedCell.next = newCell;
    }

    // get methode

    public T get(int key )
    {
        T value = null;
        int hashedIndex = getHash(key);
        Cell indexedCell = hashTableArray[hashedIndex];

        while(indexedCell != null)
        {
            if(indexedCell.getKey() == key)
            {
                value = (T) indexedCell.getValue();
                break;
            }
            indexedCell = indexedCell.next;
        }

        return value;
    }

}
