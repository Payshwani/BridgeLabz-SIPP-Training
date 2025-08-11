import java.util.*;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30};
        System.out.print("Enter index: ");
        int idx = sc.nextInt();
        System.out.print("Enter divisor: ");
        int div = sc.nextInt();
        try {
            try {
                int val = arr[idx];
                try {
                    System.out.println("Result: " + (val / div));
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (Exception e) {
            System.out.println("Unexpected error!");
        }
    }
}
