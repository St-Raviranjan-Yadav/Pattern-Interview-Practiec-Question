
public class FibonacciSeries {
    public static void main(String[] args) {
        int n, firstTerm = 0, secondTerm = 1;

        // Get the number of terms from the user
        System.out.print("Enter the number of terms: ");
        n = new java.util.Scanner(System.in).nextInt();
        System.out.print("Fibonacci Series: ");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }
}
