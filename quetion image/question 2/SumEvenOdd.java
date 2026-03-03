

public class SumEvenOdd {
    public static void main(String[] args) {
        int n, num, evenSum = 0, oddSum = 0;

        System.out.print("How many numbers? ");
      n = new java.util.Scanner(System.in).nextInt(); 
	  
	   System.out.print("Enter number " + i + ": ");
     num = new java.util.Scanner(System.in).nextInt(); 

        for (int i = 1; i <= n; i++) {
            System.out.print();
            num = scanner.nextInt();

            if (num % 2 == 0)
                evenSum += num;
            else
                oddSum += num;
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        scanner.close();
    }
}
