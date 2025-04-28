public class Main {
    public static void main(String[] args) {
        // Stack example
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek()); // Output: 20
        System.out.println(stack.pop());  // Output: 20
        System.out.println(stack.isEmpty()); // Output: false

        // Queue example
        Queue queue = new Queue();
        queue.push(10);
        queue.push(20);
        System.out.println(queue.peek()); // Output: 10
        System.out.println(queue.pop());  // Output: 10
        System.out.println(queue.isEmpty()); // Output: false
    }
}
