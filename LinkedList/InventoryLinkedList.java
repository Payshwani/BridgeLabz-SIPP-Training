// Singly Linked List: Inventory Management System
class ItemNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    ItemNode next;
    ItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventoryLinkedList {
    private ItemNode head;
    // Add, remove, update, search, total value, sort methods
    // ...existing code...
}
