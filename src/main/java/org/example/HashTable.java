package org.example;

public class HashTable <T>{
    Cell[] hashTableArray ;
    int size ;

    public HashTable(int size) {
        this.size = size;
        hashTableArray = new Cell[size];

        // initializing the cells

        for(int i = 0 ; i <size ; i++)
        {
            hashTableArray[i] = new Cell();
        }

    }
}
