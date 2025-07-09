// Check for a Pair with Given Sum in an Array
import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(target - num)) return true;
            seen.add(num);
        }
        return false;
    }
}
