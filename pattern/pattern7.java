/*
12345
23456
34567
45678
56789

*/

class  day7{
   void main(){
      int i,j;
	  System.out.print("Enter the number: ");
	  int rows = new java.util.Scanner(System.in).nextInt();
	  
	  for(i = 1; i<=rows; i++){
	     for(j = 1; j<=rows; j++){
		  System.out.print(i + j - 1);
		   
		 }
		System.out.println(" ");
	  }
	  System.out.println();
   }
}