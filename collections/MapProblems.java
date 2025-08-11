import java.util.*;
import java.io.*;

public class MapProblems {
    // Word Frequency Counter
    public static Map<String, Integer> wordFrequency(String text) {
        Map<String, Integer> freq = new HashMap<>();
        text = text.replaceAll("[.,!?"]", "").toLowerCase();
        for (String word : text.split("\\s+")) freq.put(word, freq.getOrDefault(word, 0) + 1);
        return freq;
    }

    // Invert a Map
    public static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> inv = new HashMap<>();
        for (Map.Entry<K, V> e : map.entrySet()) {
            inv.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }
        return inv;
    }

    // Find the Key with the Highest Value
    public static String maxKey(Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    // Merge Two Maps
    public static Map<String, Integer> merge(Map<String, Integer> m1, Map<String, Integer> m2) {
        Map<String, Integer> merged = new HashMap<>(m1);
        for (Map.Entry<String, Integer> e : m2.entrySet())
            merged.merge(e.getKey(), e.getValue(), Integer::sum);
        return merged;
    }

    // Group Objects by Property
    static class Employee {
        String name, dept;
        Employee(String name, String dept) { this.name = name; this.dept = dept; }
        public String toString() { return name; }
    }
    public static Map<String, List<Employee>> groupByDept(List<Employee> emps) {
        Map<String, List<Employee>> map = new HashMap<>();
        for (Employee e : emps) map.computeIfAbsent(e.dept, k -> new ArrayList<>()).add(e);
        return map;
    }

    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        System.out.println(wordFrequency(text));
        Map<String,Integer> m1 = new HashMap<>(); m1.put("A",1); m1.put("B",2); m1.put("C",1);
        System.out.println(invert(m1));
        Map<String,Integer> m2 = new HashMap<>(); m2.put("A",10); m2.put("B",20); m2.put("C",15);
        System.out.println(maxKey(m2));
        Map<String,Integer> m3 = new HashMap<>(); m3.put("A",1); m3.put("B",2);
        Map<String,Integer> m4 = new HashMap<>(); m4.put("B",3); m4.put("C",4);
        System.out.println(merge(m3,m4));
        List<Employee> emps = Arrays.asList(new Employee("Alice","HR"),new Employee("Bob","IT"),new Employee("Carol","HR"));
        System.out.println(groupByDept(emps));
    }
}
