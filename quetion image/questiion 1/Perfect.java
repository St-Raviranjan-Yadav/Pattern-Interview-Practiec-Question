



class Perfect {
    public static void main(String[] args) {
	int  sum = 0;
       System.out.print("Enter a number: ");
		 int n = new java.util.Scanner(System.in).nextInt();

        for (int i = 1; i < n; i++)
            if (n % i == 0) sum += i;

        if (sum == n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect");
    }
}
