// Circular Linked List: Round Robin Scheduling Algorithm
class ProcessNode {
    int processId;
    int burstTime;
    int priority;
    ProcessNode next;
    ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

public class RoundRobinCircularLinkedList {
    private ProcessNode head;
    // Add, remove, simulate, display, calculate methods
    // ...existing code...
}
