package JAVA2;


import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input two numbers
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();

        // Step 2: Input the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = sc.next();

        double result;

        // Step 3: Use switch-case to perform operation
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result = " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid Operator!");
        }

        sc.close();
    }
}
