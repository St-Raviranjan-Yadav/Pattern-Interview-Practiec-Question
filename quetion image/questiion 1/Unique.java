
class Unique {
    public static void main(String[] args) {
	
	  boolean unique = true;
          System.out.print("Enter a number: ");
		 int n = new java.util.Scanner(System.in).nextInt();
      

        for (int i = 0; i <= 9; i++) {
            int count = 0, t = n;
            while (t > 0) {
                if (t % 10 == i) count++;
                t /= 10;
            }
            if (count > 1) unique = false;
        }

        if (unique)
            System.out.println("Unique Number");
        else
            System.out.println("Not Unique");
    }
}
