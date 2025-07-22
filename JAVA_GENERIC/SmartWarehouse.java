// 1. Smart Warehouse Management System
import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }
    public String toString() { return name; }
}
class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
}
class Groceries extends WarehouseItem {
    Groceries(String name) { super(name); }
}
class Furniture extends WarehouseItem {
    Furniture(String name) { super(name); }
}
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public List<T> getItems() { return items; }
    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) System.out.println(item);
    }
}
class SmartWarehouseDemo {
    public static void main(String[] args) {
        Storage<Electronics> electronics = new Storage<>();
        Storage<Groceries> groceries = new Storage<>();
        electronics.addItem(new Electronics("Laptop"));
        groceries.addItem(new Groceries("Apple"));
        Storage.displayAll(electronics.getItems());
        Storage.displayAll(groceries.getItems());
    }
}
