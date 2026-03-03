


/*


    A
   AB
  ABC
 ABCD
ACBDE

*/


class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            if(i < 5) {   // normal rows
                for(int j = 0; j < i; j++) {
                    System.out.print((char)('A' + j));
                }
            } 
            else {        // special last row
                System.out.print("ACBDE");
            }

            System.out.println();
        }
    }
}
