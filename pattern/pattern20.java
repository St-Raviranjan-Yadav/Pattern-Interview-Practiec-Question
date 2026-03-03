/*


*****
ABCDE
*****
ABCDE
*****

*/

class Pattern {
    public static void main(String[] args) {

        for(int row = 1; row <= 5; row++) {

            if(row % 2 != 0) {   // odd row → stars
                for(int i = 1; i <= 5; i++) {
                    System.out.print("*");
                }
            } else {             // even row → ABCDE
                for(char ch = 'A'; ch <= 'E'; ch++) {
                    System.out.print(ch);
                }
            }

            System.out.println();
        }
    }
}


