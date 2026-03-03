/*   


    1
   121
  12321
 1234321
123454321


*/

class Pattern {
    public static void main(String[] args) {

        int n = 5; // total rows

        for(int i = 1; i <= n; i++) {

            // spaces for center alignment
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // increasing numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // decreasing numbers
            for(int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

