/*

55555
44444
33333
22222
11111


*/

class day12{
   void main(){
    
	int i, j;
	
	System.out.print("Enter the number: ");
	int rows  = new java.util.Scanner(System.in).nextInt();
	
	for(i =rows ; i>=1; i--)
	{
	  for(j =1; j<=rows; j++)
	  {
	    System.out.print(i);
		System.out.print(" ");
	  }
	  System.out.println();
	}
   
   }
}