import java.util.*;

public class ListProblems {
    // Reverse a List (ArrayList)
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) reversed.add(list.get(i));
        return reversed;
    }

    // Find Frequency of Elements
    public static Map<String, Integer> frequency(List<String> list) {
        Map<String, Integer> freq = new HashMap<>();
        for (String s : list) freq.put(s, freq.getOrDefault(s, 0) + 1);
        return freq;
    }

    // Rotate Elements in a List
    public static <T> List<T> rotate(List<T> list, int k) {
        int n = list.size();
        List<T> rotated = new ArrayList<>();
        for (int i = 0; i < n; i++) rotated.add(list.get((i + k) % n));
        return rotated;
    }

    // Remove Duplicates While Preserving Order
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();
        for (T t : list) if (seen.add(t)) result.add(t);
        return result;
    }

    // Find the Nth Element from the End (LinkedList)
    public static <T> T nthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator(), slow = list.iterator();
        int count = 0;
        while (fast.hasNext()) {
            fast.next();
            if (count++ > n) slow.next();
        }
        return slow.next();
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> arr = Arrays.asList(1,2,3,4,5);
        System.out.println(reverseList(arr));
        List<String> strList = Arrays.asList("apple","banana","apple","orange");
        System.out.println(frequency(strList));
        System.out.println(rotate(arr,2));
        System.out.println(removeDuplicates(Arrays.asList(3,1,2,2,3,4)));
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println(nthFromEnd(ll,2));
    }
}
