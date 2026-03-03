

class BuzzNo{
	  void main()
	  {
		  
		  System.out.print("Enter evem number: ");
		  int n = new java.util.Scanner(System.in).nextInt();
		 
		  int  sq = n*n;
		  if(sq%(int)Math.pow(10,String.valueOf(n).length())== n)
		  {
			  System.out.println("Automorphic Number : "+n+"*"+n+"="+sq);
		  }
		  else
		  {
			  System.out.print("Not Automorphic Number: "+n+"*"+n+"="+sq);
		  }
		  
		  }
		  
		  }