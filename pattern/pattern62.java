/*

    1
   23
  345
 4567
56789

*/


class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // numbers increasing from i
            for(int j = i; j <= 2*i - 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

