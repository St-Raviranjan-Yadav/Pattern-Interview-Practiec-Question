


public class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int num = 1; num <= 500; num++) {
            int sum = 0, temp = num, remainder;

            while (temp != 0) {
                remainder = temp % 10;
                sum += remainder * remainder * remainder;
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            }
        }
    }
}
