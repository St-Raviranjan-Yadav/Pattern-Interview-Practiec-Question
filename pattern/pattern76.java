    
	/*
	
	A
   BCB
  CDEDC
 DEFGFED
EFHIHGFED

*/


class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 0; i < n; i++) {

            // spaces (center alignment)
            for(int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            if(i < 4) {
                // increasing part
                for(int j = 0; j <= i; j++) {
                    System.out.print((char)('A' + i + j));
                }

                // decreasing part
                for(int j = i - 1; j >= 0; j--) {
                    System.out.print((char)('A' + i + j));
                }
            } else {
                // special last row
                System.out.print("EFHIHGFED");
            }

            System.out.println();
        }
    }
}

