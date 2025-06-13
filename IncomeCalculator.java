package JAVA;


import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {
        // Step 1: Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Step 2: Take input for salary and bonus
        System.out.print("Enter salary (INR): ");
        double salary = input.nextDouble();

        System.out.print("Enter bonus (INR): ");
        double bonus = input.nextDouble();

        // Step 3: Calculate total income
        double totalIncome = salary + bonus;

        // Step 4: Display the result
        System.out.printf("The salary is INR %.2f and the bonus is INR %.2f. Hence Total Income is INR %.2f\n",
                          salary, bonus, totalIncome);

        input.close();
    }
}
