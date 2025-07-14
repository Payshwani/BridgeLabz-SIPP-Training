// Circular Linked List: Task Scheduler
class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;
    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskCircularLinkedList {
    private TaskNode head;
    // Add, remove, view, display, search methods
    // ...existing code...
}
