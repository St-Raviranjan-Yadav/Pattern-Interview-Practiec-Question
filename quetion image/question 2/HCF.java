

public class HCF {
    public static void main(String[] args) {
        int a, b, temp;

        System.out.print("Enter a positive integer: ");
      a = new java.util.Scanner(System.in).nextInt(); 
	  
	  System.out.print("Enter a positive integer: ");
      b = new java.util.Scanner(System.in).nextInt(); 

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("HCF = " + a);
        scanner.close();
    }
}
