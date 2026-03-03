

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, positiveCount = 0, negativeCount = 0, zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            num = new java.util.Scanner(System.in).nextInt(); 

            if (num > 0)
                positiveCount++;
            else if (num < 0)
                negativeCount++;
            else
                zeroCount++;

            System.out.print("Do you want to continue? (y/n): ");
             choice = new java.util.Scanner(System.in).next().charAt(0); 

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zero numbers: " + zeroCount);

        scanner.close();
    }
}
