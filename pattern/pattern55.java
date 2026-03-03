
/*

ABCDE
FGHI
JKL
MN
O

*/

class Pattern {
    public static void main(String[] args) {

        int n = 5;
        char ch = 'A';

        for(int i = n; i >= 1; i--) {   // rows (5,4,3,2,1)

            for(int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;   // next letter
            }

            System.out.println();
        }
    }
}
