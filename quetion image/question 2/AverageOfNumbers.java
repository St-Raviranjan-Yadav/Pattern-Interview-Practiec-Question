

public class AverageOfNumbers {
    public static void main(String[] args) {
       
        int n, sum = 0;

        // Get the number from the user
        System.out.print("Enter a number: ");
        n =new java.util.Scanner(System.in).nextInt();

        // Calculate the sum of numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Calculate the average
        double average = (double) sum / n;
        System.out.println("Average of numbers from 1 to " + n + " is: " + average);

        scanner.close();
    }
}
