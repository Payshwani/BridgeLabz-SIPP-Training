package JAVA;

public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Step 1: Initialize fee and discount percent
        int fee = 125000;
        int discountPercent = 10;

        // Step 2: Calculate the discount amount
        int discount = (fee * discountPercent) / 100;

        // Step 3: Calculate the final fee after discount
        int discountedFee = fee - discount;

        // Step 4: Print the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
