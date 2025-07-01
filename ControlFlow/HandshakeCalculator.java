package JAVA;

import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Formula for handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output
        System.out.println("Maximum number of possible handshakes is " + handshakes);

        input.close();
    }
}
