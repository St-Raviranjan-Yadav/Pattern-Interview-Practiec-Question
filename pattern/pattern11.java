/* 
54321
54321
54321
54321
54321

*/

class day8{
  void main(){
   
   int i, j;
   System.out.print("Enter the number: ");
   int rows = new java.util.Scanner(System.in).nextInt();
   for (i = 1 ; i<=rows; i++){
      for(j = rows; j>=1; j--){
	  System.out.print(j);
	  System.out.print("");
	  }
	  System.out.println();
   }
  }

}