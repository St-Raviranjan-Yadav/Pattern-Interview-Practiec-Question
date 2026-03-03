import java.util.Random;


public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1;  // Random number between 1 and 100
        int guess;
        boolean correctGuess = false;

        System.out.println("Guess the number between 1 and 100.");

        while (!correctGuess) {
            System.out.print("Enter your guess: ");
             guess= new java.util.Scanner(System.in).nextInt(); 

            if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
                correctGuess = true;
            }
        }

        scanner.close();
    }
}
