// Java Generics Best Practices Examples
import java.util.*;

// 1. Use Generics to Ensure Type Safety
class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}

// 2. Prefer Generic Methods Over Overloading
class Util {
    public static <T> void printArray(T[] arr) {
        for (T t : arr) System.out.print(t + " ");
        System.out.println();
    }
}

// 3. Use Upper Bounded Wildcards (? extends T) for Read-Only Access
class WildcardRead {
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) System.out.println(n);
    }
}

// 4. Use Lower Bounded Wildcards (? super T) for Write Operations
class WildcardWrite {
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
    }
}

// 5. Avoid Using Raw Types
// List<String> list = new ArrayList<>(); // Always use parameterized types

// 6. Use Bounded Type Parameters for Restriction
class NumberBox<T extends Number> {
    private T num;
    public NumberBox(T num) { this.num = num; }
    public T getNum() { return num; }
}

// 7. Favor Generic Interfaces for Common Behaviors
interface Processor<T> {
    void process(T t);
}
class StringProcessor implements Processor<String> {
    public void process(String s) { System.out.println(s.toUpperCase()); }
}

// 8. Minimize Wildcard Usage in Public APIs
class WildcardApi {
    public static <T> void safeAdd(List<T> list, T item) { list.add(item); }
}

// 9. Combine Generics with Functional Interfaces and Streams
class StreamExample {
    public static <T> void printAll(Collection<T> coll) {
        coll.stream().forEach(System.out::println);
    }
}

// 10. Use Generic Constructors Where Necessary
class Pair<K, V> {
    private K key; V value;
    public <T extends K, U extends V> Pair(T key, U value) {
        this.key = key; this.value = value;
    }
}

// 11. Avoid Type Erasure Pitfalls
// Cannot use instanceof with generic type parameters
// if (obj instanceof T) { ... } // Not allowed

// 12. Favor Composition Over Inheritance in Generic Hierarchies
class Wrapper<T> {
    private T value;
    public Wrapper(T value) { this.value = value; }
    public T get() { return value; }
}
class WrapperLogger<T> {
    private Wrapper<T> wrapper;
    public WrapperLogger(Wrapper<T> wrapper) { this.wrapper = wrapper; }
    public void log() { System.out.println(wrapper.get()); }
}

// 13. Keep Generics Simple and Understandable
// Use T, E, K, V for type parameters
