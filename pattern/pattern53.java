/*

EEEEE
DDDD
CCC
BB
A

*/


class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 0; i < n; i++) {   // rows

            for(int j = 0; j < n - i; j++) {   // repeat letter
                System.out.print((char)('E' - i));
            }

            System.out.println();
        }
    }
}
