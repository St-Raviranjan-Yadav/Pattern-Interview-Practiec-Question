/*

A
BC
CDE
DEFG
EFGHI

*/


class Pattern {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {     // rows

            for(int j = 0; j <= i; j++) {
                System.out.print((char)('A' + i + j));
            }

            System.out.println();
        }
    }
}
