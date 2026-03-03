/*

A
AB
ABC
ABCD
ABCDE


*/



class Pattern {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {          // rows

            for(char ch = 'A'; ch < 'A' + i; ch++) {   // letters
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
