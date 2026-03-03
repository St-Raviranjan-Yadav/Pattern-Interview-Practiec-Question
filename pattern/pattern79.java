/*
ABCDE
B   D
C   C
D   B
A


*/

class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                if(i == 0) {
                    // first row ABCDE
                    System.out.print((char)('A' + j));
                }
                else if(i == n - 1 && j == 0) {
                    // last row only A
                    System.out.print("A");
                }
                else if(j == 0) {
                    // first column
                    System.out.print((char)('A' + i));
                }
                else if(j == n - i - 1) {
                    // diagonal reverse
                    System.out.print((char)('A' + (n - i - 1)));
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
