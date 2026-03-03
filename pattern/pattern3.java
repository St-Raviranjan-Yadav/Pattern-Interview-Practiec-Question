/*

11111
22222
33333
44444
55555

*/

class day3{
   void main(){
    
	int i, j;
	
	System.out.print("Enter the number: ");
	int rows  = new java.util.Scanner(System.in).nextInt();
	
	for(i =1 ; i<=rows; i++)
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