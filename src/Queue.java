class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null; // Handle case when queue becomes empty
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
