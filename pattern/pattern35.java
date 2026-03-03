
/*

*****
****
***
**
*

*/


class Pattern {
    public static void main(String[] args) {

        for(int i = 5; i >= 1; i--) {   // rows
            for(int j = 1; j <= i; j++) {  // stars
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
