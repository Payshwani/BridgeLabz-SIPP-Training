// Doubly Linked List: Undo/Redo Functionality for Text Editor
class TextStateNode {
    String text;
    TextStateNode next, prev;
    TextStateNode(String text) {
        this.text = text;
        this.next = this.prev = null;
    }
}

public class UndoRedoDoublyLinkedList {
    private TextStateNode head, tail, current;
    // Add, undo, redo, display, limit history methods
    // ...existing code...
}
