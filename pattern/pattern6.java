/*
11111
00000
11111
00000
11111



*/

class day6{
   void main(){
     int i , j;
	 System.out.print("Enter the number: ");
	 int rows = new java.util.Scanner(System.in).nextInt();
	 
	 for(i = 1; i<=rows; i++){
	    for( j =1 ;j<=rows; j++){
		  if(i%2 == 1){
		    System.out.print("1");
		  }
		else{
             System.out.print("0");
          }		
		}
		System.out.println("");
	 }
	 System.out.println();
   }

}