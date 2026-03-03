/*

12345
ABCDE
12345
ABCDE
12345


*/


class Pattern {
    public static void main(String[] args) {

        for(int row = 1; row <= 5; row++) {

            if(row % 2 != 0) {   // odd row → numbers
                for(int i = 1; i <= 5; i++) {
                    System.out.print(i);
                }
            } 
            else {              // even row → letters
                for(char ch = 'A'; ch <= 'E'; ch++) {
                    System.out.print(ch);
                }
            }

            System.out.println();
        }
    }
}
