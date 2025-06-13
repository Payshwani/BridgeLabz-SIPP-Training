package JAVA;

import java.util.Scanner;

public class ChocolateDivider {
    public static void main(String[] args) {
        // Step 1: Create Scanner object
        Scanner input = new Scanner(System.in);

        // Step 2: Get user input
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Step 3: Perform calculations
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Step 4: Display results
        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates is %d\n",
                          chocolatesPerChild, remainingChocolates);

        input.close();
    }
}
