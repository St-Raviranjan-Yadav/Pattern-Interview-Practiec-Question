


class Composite {
    public static void main(String[] args) {
		int count=0;
        System.out.print("Enter a number: ");
		 int n = new java.util.Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        if (count > 2)
            System.out.println("Composite Number");
        else
            System.out.println("Not Composite");
    }
}
