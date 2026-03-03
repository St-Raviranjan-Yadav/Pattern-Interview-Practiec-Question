

class Ugly{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
		  int n = new java.util.Scanner(System.in).nextInt();

        for (int i : new int[]{2,3,5})
            while (n % i == 0)
                n /= i;

        if (n == 1)
            System.out.println("Ugly Number");
        else
            System.out.println("Not Ugly");
    }
}
