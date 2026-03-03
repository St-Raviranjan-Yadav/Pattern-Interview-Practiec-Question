

public class LogarithmOfTwo {
    public static void main(String[] args) {
        int n;
        double log2 = 0;

        System.out.print("Enter the number of terms: ");
       n = new java.util.Scanner(System.in).nextInt(); 
		
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                log2 -= 1.0 / i;
            } else {
                log2 += 1.0 / i;
            }
        }

        System.out.println("Natural logarithm of 2 (approx.): " + log2);

        scanner.close();
    }
}
