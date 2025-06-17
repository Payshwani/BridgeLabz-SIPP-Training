package JAVA2;


public class DayOfWeek {
    public static void main(String[] args) {
        // Check if exactly 3 command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        // Parse command-line arguments
        int m = Integer.parseInt(args[0]); // Month
        int d = Integer.parseInt(args[1]); // Day
        int y = Integer.parseInt(args[2]); // Year

        // Step 1: Calculate y0
        int y0 = y - (14 - m) / 12;

        // Step 2: Calculate x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Step 3: Calculate m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Step 4: Calculate d0
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output result
        System.out.println("Day of the week: " + d0);
        System.out.println("(0 = Sunday, 1 = Monday, ..., 6 = Saturday)");
    }
}
