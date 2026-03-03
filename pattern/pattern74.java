   
/*

   0
   101
  21012
 3210123
432101234


*/



class Pattern {
    public static void main(String[] args) {

        int n = 5; // total rows

        for(int i = 0; i < n; i++) {

            // spaces for center alignment
            for(int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            // decreasing numbers to 0
            for(int j = i; j >= 0; j--) {
                System.out.print(j);
            }

            // increasing numbers from 1 to i
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
