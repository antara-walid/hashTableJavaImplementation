package org.example;

public class Cell {
    private  int key ;
    private Object value;
     Cell next;

    //constructors

    public Cell(int key, Object value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public Cell() {
        this.next = null;
    }

    //getters and setters


    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
