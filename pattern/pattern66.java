/*

        1
      3 2 1
    5 4 3 2 1
  7 6 5 4 3 2 1
9 8 7 6 5 4 3 2 1


*/


class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            int start = 2 * i - 1;

            // spaces for center alignment
            for(int s = 1; s <= n - i; s++) {
                System.out.print("  "); // double space for better alignment
            }

            // decreasing numbers
            for(int j = start; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
