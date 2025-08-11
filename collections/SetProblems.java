import java.util.*;

public class SetProblems {
    // Check if Two Sets Are Equal
    public static <T> boolean areEqual(Set<T> s1, Set<T> s2) {
        return s1.equals(s2);
    }

    // Union and Intersection of Two Sets
    public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1); result.addAll(s2); return result;
    }
    public static <T> Set<T> intersection(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1); result.retainAll(s2); return result;
    }

    // Symmetric Difference
    public static <T> Set<T> symmetricDiff(Set<T> s1, Set<T> s2) {
        Set<T> result = new HashSet<>(s1); result.addAll(s2);
        Set<T> tmp = new HashSet<>(s1); tmp.retainAll(s2);
        result.removeAll(tmp); return result;
    }

    // Convert a Set to a Sorted List
    public static List<Integer> sortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set); Collections.sort(list); return list;
    }

    // Find Subsets
    public static <T> boolean isSubset(Set<T> s1, Set<T> s2) {
        return s2.containsAll(s1);
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,2,1));
        System.out.println(areEqual(s1,s2));
        System.out.println(union(s1,new HashSet<>(Arrays.asList(3,4,5))));
        System.out.println(intersection(s1,new HashSet<>(Arrays.asList(3,4,5))));
        System.out.println(symmetricDiff(s1,new HashSet<>(Arrays.asList(3,4,5))));
        System.out.println(sortedList(new HashSet<>(Arrays.asList(5,3,9,1))));
        System.out.println(isSubset(new HashSet<>(Arrays.asList(2,3)),new HashSet<>(Arrays.asList(1,2,3,4))));
    }
}
