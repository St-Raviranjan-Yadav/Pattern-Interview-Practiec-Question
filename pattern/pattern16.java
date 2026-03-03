/*
Enter the alphbte character:  E

E D C B A
F E D C B
G F E D C
H G F E D
I H G F E



*/

class Day16 {
    void main() throws Exception {
     
        System.out.print("Enter alphabet uppercase character: ");
       char alphabet = new java.util.Scanner(System.in).next().charAt(0);

        int z = alphabet - 'A' + 1;   // total rows
		
        for (int i = 0; i < z ; i++) {
            char ch = (char) ('A' + i + z  - 1);  // Row ka first character
			
			
            for (int j = 0; j < z ; j++) {
                System.out.print((char)(ch - j) + " "); // Descending print
				
            }
            System.out.println();
        }
    }
}
