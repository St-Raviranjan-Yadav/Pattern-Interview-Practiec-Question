

public class RightAlignedPyramid {
    public static void main(String[] args) {
        int n;

        // Get the number of rows (n) from the user
        System.out.print("Enter the number of rows: ");
        n = new java.util.Scanner(System.in).nextInt(); 

        // Generate the right-aligned pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for right alignment
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print the decreasing part of the row
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            // Print the increasing part of the row
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
