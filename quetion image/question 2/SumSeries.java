

public class SumSeries {
    public static void main(String[] args) {
        int n;
        double sum = 0;

        System.out.print("Enter the value of n: ");
        n = new java.util.Scanner(System.in).nextInt(); 


        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Sum of series: " + sum);

        scanner.close();
    }
}
