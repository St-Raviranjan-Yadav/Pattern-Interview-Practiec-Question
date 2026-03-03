

public class Factorial {
    public static void main(String[] args) {
    
        int n;
        long factorial = 1;

        // Get the number from the user
        System.out.print("Enter a number: ");
       
         n= new java.util.Scanner(System.in).nextInt();

        // Calculate the factorial of the number
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);

        scanner.close();
    }
}
