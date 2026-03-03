/*
    1
   32
  543
 7654
98765

*/


class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // numbers reverse starting from (2*i - 1)
            for(int j = 2*i - 1; j >= i; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
