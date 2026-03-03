/*

A
BC
CDE
DEFG
EFGHI

*/

class Pattern {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {          // rows

            char ch = (char)('A' + i);        // starting letter

            for(int j = 0; j <= i; j++) {     // letters print
                System.out.print((char)(ch + j));
            }

            System.out.println();
        }
    }
}
