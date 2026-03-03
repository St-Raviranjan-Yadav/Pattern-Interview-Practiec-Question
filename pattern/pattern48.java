

/*
ABCDE
ABCD
ABC
AB
A


*/


class Pattern {
    public static void main(String[] args) {

        for(int i = 5; i >= 1; i--) {   // rows (5 se 1 tak)

            for(char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
