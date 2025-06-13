package JAVA;

public class ProfitCalculator {
    public static void main(String[] args) {
        // Step 1: Define cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;

        // Step 2: Calculate profit and profit percentage
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        // Step 3: Print all results in a single print statement (multiline)
        System.out.printf(
            "The Cost Price is INR %d and the Selling Price is INR %d\n" +
            "The Profit is INR %d and the Profit Percentage is %.2f%%\n",
            costPrice, sellingPrice, profit, profitPercentage
        );
    }
}
