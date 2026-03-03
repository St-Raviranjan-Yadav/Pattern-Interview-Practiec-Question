

public class SumLoop {
    public static void main(String[] args) {
        int num1, num2, sum;
        char choice;

        do {
   
			 System.out.print("Enter two numbers: ");
            num1 = new java.util.Scanner(System.in).nextInt(); 
	
	         System.out.print("Enter two numbers: ");
             num2 = new java.util.Scanner(System.in).nextInt(); 

            sum = num1 + num2;
            System.out.println("Sum = " + sum);

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}
