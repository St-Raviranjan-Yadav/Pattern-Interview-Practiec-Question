

public class NearestPerfectSquare {
    public static void main(String[] args) {
        int num;

        // Get the number from the user
        System.out.print("Enter a number: ");
          num = new java.util.Scanner(System.in).nextInt();

        // Find the square root of the number
        int sqrt = (int) Math.sqrt(num);

        // Calculate the nearest perfect square
        int lowerSquare = sqrt * sqrt;
        int higherSquare = (sqrt + 1) * (sqrt + 1);

        // Find the nearest perfect square
        if (Math.abs(num - lowerSquare) <= Math.abs(num - higherSquare)) {
            System.out.println("Nearest perfect square: " + lowerSquare);
        } else {
            System.out.println("Nearest perfect square: " + higherSquare);
        }

        scanner.close();
    }
}
