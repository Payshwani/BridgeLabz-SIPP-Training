// Singly Linked List: Social Media Friend Connections
import java.util.ArrayList;
import java.util.List;

class UserNode {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    UserNode next;
    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

public class SocialMediaLinkedList {
    private UserNode head;
    // Add, remove, mutual, display, search, count methods
    // ...existing code...
}
