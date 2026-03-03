

class Krishnamurti {
    public static void main(String[] args) {
          int	t = n, sum = 0;
      System.out.print("Enter a number: ");
		 int n = new java.util.Scanner(System.in).nextInt();

        while (t > 0) {
            int d = t % 10, fact = 1;
            for (int i = 1; i <= d; i++)
                fact *= i;
            sum += fact;
            t /= 10;
        }

        if (sum == n)
            System.out.println("Krishnamurti Number");
        else
            System.out.println("Not Krishnamurti");
    }
}
