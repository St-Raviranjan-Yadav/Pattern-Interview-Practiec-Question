/*

        1
      123
     12345
    1234567
   123456789


*/

class Pattern {
    public static void main(String[] args) {

        int n = 5; // total rows

        for(int i = 1; i <= n; i++) {

            int count = 2 * i - 1; // 1,3,5,7,9

            // spaces for center alignment
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // print numbers
            for(int j = 1; j <= count; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
