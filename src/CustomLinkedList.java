package com.example.LinkedListDemo;

class CustomLinkedList {
    private Node start;

    public void append(int value) {
        Node newNode = new Node(value);

        if (start == null) {
            start = newNode;
        } else {
            Node current = start;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void printList() {
        Node current = start;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public int size() {
        int count = 0;
        Node current = start;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void removeLast() {
        if (start == null) {
            return;
        }

        if (start.getNext() == null) {
            start = null;
            return;
        }

        Node current = start;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
    }

    public void removeAtPosition(int position) {
        if (position == 0 && start != null) {
            start = start.getNext();
            return;
        }

        Node current = start;
        Node previous = null;

        for (int i = 0; i < position; i++) {
            if (current == null) {
                return;
            }
            previous = current;
            current = current.getNext();
        }

        if (current != null && previous != null) {
            previous.setNext(current.getNext());
        }
    }
}