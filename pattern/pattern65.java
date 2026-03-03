/*
    A
   BB
  CCC
 DDDD
EEEEE


*/



class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            // spaces (right align)
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // same letter print
            for(int j = 1; j <= i; j++) {
                System.out.print((char)('A' + i - 1));
            }

            System.out.println();
        }
    }
}
