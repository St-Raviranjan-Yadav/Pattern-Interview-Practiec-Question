
public class SimpleInterest {
    public static void main(String[] args) {

        double principal, rate, time, simpleInterest;

        // Get the inputs from the user
        System.out.print("Enter the principal amount: ");
        principal = new java.utilScanner(System.in).nextDouble();
		
        System.out.print("Enter the rate of interest: ");
        rate =  new java.utilScanner(System.in).nextDouble();
		
        System.out.print("Enter the time period (in years): ");
        time = new java.utilScanner(System.in).nextDouble();

        // Calculate Simple Interest
        simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is: " + simpleInterest);

        scanner.close();
    }
}
