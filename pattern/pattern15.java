
/*

A B C D E 	
B C D E F
C D E F G
D F E G H
F E G H I 	


*/


class day15{
    public static void main(String[] args) throws Exception {

        int i, j;
        char alphabet;

        System.out.print("Enter last uppercase character: ");
        int z = System.in.read();  

        for(i = 1; i <= (z - 'A' + 1); i++) {   
              alphabet = (char)('A' + i - 1);                    
            for(j = 'A'; j <= z; j++) {
				
                System.out.print(alphabet);
                alphabet++;
			
            }
            System.out.println();
        }
    }
}
