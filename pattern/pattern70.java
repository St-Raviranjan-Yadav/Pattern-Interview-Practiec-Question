/*

       1
      234
     56789
  10111213141516
171819202122232425


*/


class Pattern {
    public static void main(String[] args) {

        int n = 5;  // total rows
        int num = 1;

        int[] rowLength = {1, 3, 5, 8, 11}; // har row me print length

        for(int i = 0; i < n; i++) {

            // spaces for center alignment
            for(int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            // numbers
            for(int j = 0; j < rowLength[i]; j++) {
                System.out.print(num);
                num++;
            }

            System.out.println();
        }
    }
}
