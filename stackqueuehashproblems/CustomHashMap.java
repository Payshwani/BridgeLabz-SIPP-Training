// Custom Hash Map Implementation
import java.util.LinkedList;

public class CustomHashMap<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;
        Entry(K key, V value) { this.key = key; this.value = value; }
    }
    private final int SIZE = 16;
    private LinkedList<Entry<K, V>>[] table;

    public CustomHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) table[i] = new LinkedList<>();
    }

    public void put(K key, V value) {
        int idx = Math.abs(key.hashCode() % SIZE);
        for (Entry<K, V> entry : table[idx]) {
            if (entry.key.equals(key)) { entry.value = value; return; }
        }
        table[idx].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int idx = Math.abs(key.hashCode() % SIZE);
        for (Entry<K, V> entry : table[idx]) {
            if (entry.key.equals(key)) return entry.value;
        }
        return null;
    }

    public void remove(K key) {
        int idx = Math.abs(key.hashCode() % SIZE);
        table[idx].removeIf(entry -> entry.key.equals(key));
    }
}
