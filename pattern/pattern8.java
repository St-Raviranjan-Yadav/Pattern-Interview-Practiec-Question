
/*

A B C D E 	
A B C D E
A B C D E 	
A B C D E
A B C D E 	


*/


class day8 {
    public static void main(String[] args) throws Exception {

        int i, j;
        char alphabet;

        System.out.print("Enter last uppercase character: ");
        int z = System.in.read();  

        for(i = 1; i <= (z - 'A' + 1); i++) {   
            alphabet = 'A';                     
            for(j = 'A'; j <= z; j++) {
                System.out.print(alphabet);
                alphabet++;
				System.out.print(" ");
            }
            System.out.println();
        }
    }
}
