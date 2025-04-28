package com.example.LinkedListDemo;

public class Node {
    private int data; // Private field to store data
    private Node next; // Private field to store reference to the next node

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        if (data < 0) {
            return; // Prevent setting negative values for data
        }
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}