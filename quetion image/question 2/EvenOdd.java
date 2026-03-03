import java.util.Scanner;

class SumEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, num;
        int evenSum = 0, oddSum = 0;

        System.out.print("How many numbers: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            num = sc.nextInt();

            if(num % 2 == 0)
                evenSum += num;
            else
                oddSum += num;
        }

        System.out.println("Sum of Even numbers = " + evenSum);
        System.out.println("Sum of Odd numbers = " + oddSum);
    }
}
