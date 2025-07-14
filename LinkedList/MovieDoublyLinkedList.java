// Doubly Linked List: Movie Management System
class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next, prev;
    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = this.prev = null;
    }
}

public class MovieDoublyLinkedList {
    private MovieNode head, tail;
    // Add, remove, search, display, update methods
    // ...existing code...
}
