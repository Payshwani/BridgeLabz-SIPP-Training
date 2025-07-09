// Counting Sort - Sort Student Ages (10 to 18)
public class CountingSortStudentAges {
    public static void countingSort(int[] ages) {
        int min = 10, max = 18;
        int[] count = new int[max - min + 1];
        for (int age : ages) count[age - min]++;
        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) ages[idx++] = i + min;
        }
    }
}
