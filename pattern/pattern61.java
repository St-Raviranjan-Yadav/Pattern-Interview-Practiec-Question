/*
    1
   21
  321
 4321
54321



*/


class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // reverse numbers
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
