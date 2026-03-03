/*
EDCBA
DCBA
CBA
BA
A


*/

class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 0; i < n; i++) {      // rows

            for(int j = n - 1 - i; j >= 0; j--) {  
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}
