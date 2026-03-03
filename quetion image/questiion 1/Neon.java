

class Neon {
    public static void main(String[] args) {
	         int sq = n * n, sum = 0;
          System.out.print("Enter a number: ");
		 int n = new java.util.Scanner(System.in).nextInt();
       

        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }

        if (sum == n)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon");
    }
}
