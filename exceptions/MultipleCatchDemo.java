import java.util.*;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        int[] arr = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        if (size > 0) arr = new int[size];
        for (int i = 0; arr != null && i < size; i++) arr[i] = i * 2;
        System.out.print("Enter index: ");
        int idx = sc.nextInt();
        try {
            System.out.println("Value at index " + idx + ": " + arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
