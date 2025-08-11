import java.util.*;

public class QueueProblems {
    // Reverse a Queue
    public static <T> Queue<T> reverseQueue(Queue<T> q) {
        Stack<T> stack = new Stack<>();
        while (!q.isEmpty()) stack.push(q.remove());
        while (!stack.isEmpty()) q.add(stack.pop());
        return q;
    }

    // Generate Binary Numbers Using a Queue
    public static List<String> generateBinary(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 0; i < N; i++) {
            String s = q.remove();
            result.add(s);
            q.add(s + "0");
            q.add(s + "1");
        }
        return result;
    }

    // Hospital Triage System
    static class Patient implements Comparable<Patient> {
        String name; int severity;
        Patient(String name, int severity) { this.name = name; this.severity = severity; }
        public int compareTo(Patient p) { return p.severity - this.severity; }
        public String toString() { return name; }
    }
    public static List<String> triage(List<Patient> patients) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(patients);
        List<String> order = new ArrayList<>();
        while (!pq.isEmpty()) order.add(pq.poll().name);
        return order;
    }

    // Implement a Stack Using Queues
    static class StackQ {
        Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();
        void push(int x) { q2.add(x); while (!q1.isEmpty()) q2.add(q1.remove()); Queue<Integer> tmp = q1; q1 = q2; q2 = tmp; }
        int pop() { return q1.remove(); }
        int top() { return q1.peek(); }
    }

    // Circular Buffer Simulation
    static class CircularBuffer {
        int[] arr; int start = 0, end = 0, size = 0, cap;
        CircularBuffer(int cap) { arr = new int[cap]; this.cap = cap; }
        void insert(int x) { if (size < cap) size++; else start = (start+1)%cap; arr[end] = x; end = (end+1)%cap; }
        List<Integer> getBuffer() {
            List<Integer> buf = new ArrayList<>();
            for (int i = 0; i < size; i++) buf.add(arr[(start+i)%cap]);
            return buf;
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30));
        System.out.println(reverseQueue(q));
        System.out.println(generateBinary(5));
        List<Patient> patients = Arrays.asList(new Patient("John",3),new Patient("Alice",5),new Patient("Bob",2));
        System.out.println(triage(patients));
        StackQ stack = new StackQ(); stack.push(1); stack.push(2); stack.push(3); System.out.println(stack.pop());
        CircularBuffer buf = new CircularBuffer(3); buf.insert(1); buf.insert(2); buf.insert(3); buf.insert(4); System.out.println(buf.getBuffer());
    }
}
