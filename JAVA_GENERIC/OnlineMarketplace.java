// 2. Dynamic Online Marketplace
import java.util.*;

interface Category { String getCategoryName(); }
class BookCategory implements Category {
    public String getCategoryName() { return "Book"; }
}
class ClothingCategory implements Category {
    public String getCategoryName() { return "Clothing"; }
}
class Product<T extends Category> {
    String name;
    double price;
    T category;
    Product(String name, double price, T category) {
        this.name = name; this.price = price; this.category = category;
    }
    public String toString() {
        return name + " (" + category.getCategoryName() + ", $" + price + ")";
    }
}
class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.price = product.price * (1 - percent/100);
    }
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 300, new ClothingCategory());
        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
        System.out.println(book);
        System.out.println(shirt);
    }
}
