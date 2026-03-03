

class BuzzNo{
	  void main()
	  {

		  System.out.print("Enter evem number: ");
		 int n = new java.util.Scanner(System.in).nextInt();
		  if(n % 7 == 0 || n%10 == 7)
		  {
			  System.out.println("Buzz No: "+n);
		  }
		  else
		  {
			  System.out.print("Not Buzz No: "+n);
		  }
		  
		  }
		  
		  }