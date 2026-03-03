/*
54321
65432
76543
87654
98765

*/

class  day13{
   void main(){
      int i,j;
	  System.out.print("Enter the number: ");
	  int rows = new java.util.Scanner(System.in).nextInt();
	  
	  for(i = 1; i<=rows; i++){
	     for(j = rows; j>=1; j--){
		  System.out.print(i + j - 1);
		   
		 }
		System.out.println(" ");
	  }
	  System.out.println();
   }
}