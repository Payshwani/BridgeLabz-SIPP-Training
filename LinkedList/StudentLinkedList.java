// Singly Linked List: Student Record Management
class StudentNode {
    int rollNumber;
    String name;
    int age;
    String grade;
    StudentNode next;
    StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentLinkedList {
    private StudentNode head;
    // Add, delete, search, display, update methods
    // ...existing code...
}
