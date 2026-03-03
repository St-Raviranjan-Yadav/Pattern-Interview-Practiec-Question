  
/*



    E
   DDD
  CCCCC
 BBBBBBB
AAAAAAAAA


*/



class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            int count = 2 * i - 1;   // 1,3,5,7,9

            // spaces
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // letters (reverse from E)
            for(int j = 1; j <= count; j++) {
                System.out.print((char)('A' + n - i));
            }

            System.out.println();
        }
    }
}
