
/*
ABCDE
BCDE
CDE
DE
E

*/
class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 0; i < n; i++) {          // rows

            for(int j = i; j < n; j++) {      // letters
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}
