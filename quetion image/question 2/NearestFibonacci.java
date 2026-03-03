

public class NearestFibonacci {
    public static void main(String[] args) {
     
        int num;

        // Get the number from the user
        System.out.print("Enter a number: ");
         num = new java.util.Scanner(System.in).nextInt();

        // Generate Fibonacci numbers and find the nearest
        int a = 0, b = 1, nextTerm = 0;
        while (nextTerm < num) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
        }

        // Check which Fibonacci number is closer
        int lowerFib = b;
        int upperFib = nextTerm;

        if (Math.abs(num - lowerFib) <= Math.abs(num - upperFib)) {
            System.out.println("Nearest Fibonacci number: " + lowerFib);
        } else {
            System.out.println("Nearest Fibonacci number: " + upperFib);
        }

        scanner.close();
    }
}
