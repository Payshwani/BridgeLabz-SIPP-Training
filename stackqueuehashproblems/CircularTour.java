// Circular Tour Problem
import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {
    public static int findStart(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0, end = 1;
        int currPetrol = petrol[start] - distance[start];
        while (start != end || currPetrol < 0) {
            while (currPetrol < 0 && start != end) {
                currPetrol -= petrol[start] - distance[start];
                start = (start + 1) % n;
                if (start == 0) return -1;
            }
            currPetrol += petrol[end] - distance[end];
            end = (end + 1) % n;
        }
        return start;
    }
}
