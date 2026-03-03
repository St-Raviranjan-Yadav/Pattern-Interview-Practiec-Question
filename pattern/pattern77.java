/*
	
	*
   abc
  *****
 abcdefg
*********


*/


class Pattern {
    public static void main(String[] args) {

        int n = 5;
        int stars = 1;
        int letters = 3;

        for(int row = 1; row <= n; row++) {

            // spaces (center ke liye)
            int width = 9;   // last row me 9 characters
            int current = (row % 2 != 0) ? stars : letters;

            for(int s = 1; s <= (width - current) / 2; s++) {
                System.out.print(" ");
            }

            if(row % 2 != 0) {   // odd row → stars
                for(int i = 1; i <= stars; i++) {
                    System.out.print("*");
                }
                stars += 4;
            } 
            else {              // even row → letters
                for(char ch = 'a'; ch < 'a' + letters; ch++) {
                    System.out.print(ch);
                }
                letters += 4;
            }

            System.out.println();
        }
    }
}
