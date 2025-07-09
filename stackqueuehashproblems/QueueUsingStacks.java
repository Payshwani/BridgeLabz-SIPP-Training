// Implement a Queue using two Stacks
import java.util.Stack;

public class QueueUsingStacks<T> {
    private Stack<T> stackEnqueue = new Stack<>();
    private Stack<T> stackDequeue = new Stack<>();

    public void enqueue(T item) {
        stackEnqueue.push(item);
    }

    public T dequeue() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        if (stackDequeue.isEmpty()) throw new RuntimeException("Queue is empty");
        return stackDequeue.pop();
    }

    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }
}
