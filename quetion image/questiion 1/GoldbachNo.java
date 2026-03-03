


class GoldbachNo{
	  void main()
	  {
		  int i,j,k;
		  System.out.print("Enter evem number: ");
		 int n = new java.util.Scanner(System.in).nextInt();
		  
		  for(i = 2; i <= n/2; i++)
		  {
			 for(j = 2; j < i; j++)
				 if(i%j==0) break;
				 
				 if(j == i){
					 for(k=2; k<n-i; k++)
					 
						 if((n-i)%k==0)break;
						 
				  	 if(k==n-i)
						 System.out.println(n+"="+i+"+"+(n-i));
				   } 
				 }
			 }
			  
		  }
		  