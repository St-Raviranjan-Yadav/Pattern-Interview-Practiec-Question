
/*
      *
     * *
    * * *
   * * * *
  * * * * *
  
  */
  
  
class Pattern1{
	void main(){
		int no =5;
		int i,j, k ;
		
		for(i=1; i<=no; i++){
			for(j= -1; j<=no-i; j++){
				System.out.print(" ");
			}
			for(k=1; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	
	
}