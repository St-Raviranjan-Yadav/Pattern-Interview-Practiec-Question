
/*
ABCDE
BCDE
CDE
DE
E

*/


class Pattern {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {   // rows

            for(char ch = (char)('A' + i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
