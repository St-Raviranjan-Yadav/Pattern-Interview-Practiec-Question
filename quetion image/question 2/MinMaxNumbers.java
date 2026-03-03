
public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        char choice;

        do {
            System.out.print("Enter a number: ");
            num = new java.util.Scanner(System.in).nextInt(); 


            if (num > largest)
                largest = num;
            if (num < smallest)
                smallest = num;

              System.out.print("Do you want to continue? (y/n): ");
             choice = new java.util.Scanner(System.in).next().charAt(0); 

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        scanner.close();
    }
}
