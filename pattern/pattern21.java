/*

ABCDE
abcde
ABCDE
abcde
ABCDE

*/

class Pattern {
    public static void main(String[] args) {

        for(int row = 1; row <= 5; row++) {

            if(row % 2 != 1) {   // even row → small letters
                for(char ch = 'a'; ch <= 'e'; ch++) {
                    System.out.print(ch);
                }
            } 
            else {               // odd row → capital letters
                for(char ch = 'A'; ch <= 'E'; ch++) {
                    System.out.print(ch);
                }
            }

            System.out.println();
        }
    }
}
