package JAVA;


public class PenDistribution {
    public static void main(String[] args) {
        // Step 1: Total pens and students
        int totalPens = 14;
        int totalStudents = 3;

        // Step 2: Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        // Step 3: Print result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
