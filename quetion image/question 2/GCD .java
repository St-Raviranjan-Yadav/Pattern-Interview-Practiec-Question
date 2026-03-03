
public class GCD {
    public static void main(String[] args) {
       
        int a, b;

        // Get the numbers from the user
        System.out.print("Enter the first number: ");
        a = new java.util.Scanner(System.in).nextInt();
        System.out.print("Enter the second number: ");
        b = new java.util.Scanner(System.in).nextInt();

        // Calculate GCD using the Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD of the given numbers is: " + a);

        scanner.close();
    }
}
