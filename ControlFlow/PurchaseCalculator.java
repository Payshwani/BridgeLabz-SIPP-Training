package JAVA;

import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        // Step 1: Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Step 2: Take input for unit price and quantity
        System.out.print("Enter unit price of the item (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity to be bought: ");
        int quantity = input.nextInt();

        // Step 3: Calculate total purchase price
        double totalPrice = unitPrice * quantity;

        // Step 4: Display the result
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and the unit price is INR %.2f\n",
                          totalPrice, quantity, unitPrice);

        input.close();
    }
}
