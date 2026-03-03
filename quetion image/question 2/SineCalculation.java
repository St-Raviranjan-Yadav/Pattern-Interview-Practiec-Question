

public class SineCalculation {
    public static void main(String[] args) {
        double x, sine = 0;
        int n;

        System.out.print("Enter the value of x (in radians): ");
       x = new java.util.Scanner(System.in).nextDouble(); 
        System.out.print("Enter the number of terms in the series: ");
           n = new java.util.Scanner(System.in).nextInt(); 

        // Compute sin(x) using the series
        for (int i = 0; i < n; i++) {
            int exponent = 2 * i + 1;
            double term = Math.pow(x, exponent) / factorial(exponent);
            if (i % 2 == 0) {
                sine += term;
            } else {
                sine -= term;
            }
        }

        System.out.println("Approximate value of sin(" + x + ") is: " + sine);
        scanner.close();
    }

    // Method to compute factorial
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
