

class Magic {
    public static void main(String[] args) {
	
        System.out.print("Enter a number: ");
		 int n = new java.util.Scanner(System.in).nextInt();

        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }

        if (n == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic");
    }
}
