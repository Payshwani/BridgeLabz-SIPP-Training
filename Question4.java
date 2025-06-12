package JAVA;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double fee = 125000;
        double discountPercent = 10;

        // Step 2: Calculate the discount amount
        double discount = (discountPercent / 100) * fee;

        // Step 3: Calculate the final fee after discount
        double finalFee = fee - discount;

        // Step 4: Print the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
