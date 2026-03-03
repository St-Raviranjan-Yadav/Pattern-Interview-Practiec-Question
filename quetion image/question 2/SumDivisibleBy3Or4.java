

public class SumDivisibleBy3Or4 {
    public static void main(String[] args) {
     
        int start, end, sum = 0;

        // Get the range of numbers from the user
        System.out.print("Enter the start number: ");
        start = new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the end number: ");
        end = new java.util.Scanner(System.in).nextInt();

        // Loop through the range and add numbers divisible by 3 or 4
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of numbers divisible by 3 or 4: " + sum);

        scanner.close();
    }
}
