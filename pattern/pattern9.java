/*

*****
22222
*****
44444
*****

*/





class day9{
   void main(){
     int i , j;
	 System.out.print("Enter the number: ");
	 int rows = new java.util.Scanner(System.in).nextInt();
	 
	 for(i = 1; i<=rows; i++){
	    for( j =1; j<=rows; j++){
		  if(i%2 != 0){
		    System.out.print("*");
		  }
		else{
             System.out.print(i);
          }	
           	  
		}
		System.out.println(" ");	
	 }
	 System.out.println();
   }

}