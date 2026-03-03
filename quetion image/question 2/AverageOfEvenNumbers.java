

public class AverageOfEvenNumbers {
    public static void main(String[] args) {
       
        int n, sum = 0, count = 0;

        // Get the number from the user
        System.out.print("Enter a number: ");
        n = new java.util.Scanner(System.in).nextInt();

        // Loop through numbers and add even numbers
        for (int i = 2; i <= n; i += 2) {
            sum += i;
            count++;
        }

        // Calculate the average of even numbers
        double average = (count > 0) ? (double) sum / count : 0;
        System.out.println("Average of even numbers from 1 to " + n + " is: " + average);

        scanner.close();
    }
}
