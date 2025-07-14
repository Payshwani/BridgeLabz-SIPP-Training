// Doubly Linked List: Library Management System
class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean available;
    BookNode next, prev;
    BookNode(String title, String author, String genre, int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.next = this.prev = null;
    }
}

public class LibraryDoublyLinkedList {
    private BookNode head, tail;
    // Add, remove, search, update, display, count methods
    // ...existing code...
}
