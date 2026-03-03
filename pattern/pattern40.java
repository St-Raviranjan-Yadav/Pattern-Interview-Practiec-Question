/*

* * * * *
*       *
*       *
*       *
* * * * *

*/

class trianglepatter{
  
    void main(){
       int i,j,no=5;
     for(i =1; i<=no; i++){
      
	    for(j =1; j<=no; j++){
			if(i==1 || i==no || j==1 || j==no)
				
	    System.out.print("* ");
	     
		 else
			 System.out.print("  ");
		}
		System.out.println();
         }	 
	  
	}

}