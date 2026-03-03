
/*

Enter the rows no: 5
Enter the column no: 5
ABCDE
FGHIJ
KLMNO
PQRST
UVWXY



*/


class day19{
   
   void main(){
	System.out.print("Enter the rows no: ");
   int rows = new java.util.Scanner(System.in).nextInt();
   
   
   char cha ='A';
    
    for(int i = 1; i<=rows; i++){
     for(int j = 1; j<=rows; j++){
	  System.out.print(cha);
	  cha++;
	  
	    }
		System.out.println();
		
	
      }	
		
   }



}