/*

****
1234
***
12
*

*/

class PatternExample {
    public static void main(String[] args) {

        for(int row = 1; row <= 5; row++) {

            if(row == 1) {
                for(int i = 1; i <= 4; i++)
                    System.out.print("*");
            }
            else if(row == 2) {
                for(int i = 1; i <= 4; i++)
                    System.out.print(i);
            }
            else if(row == 3) {
                for(int i = 1; i <= 3; i++)
                    System.out.print("*");
            }
            else if(row == 4) {
                for(int i = 1; i <= 2; i++)
                    System.out.print(i);
            }
            else {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
