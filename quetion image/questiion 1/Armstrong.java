
		  
class Armstrong{
	  void main()
	  {
		  int temp=n,sum =0,digit,count = 0;
		  
		  System.out.print("Enter evem number: ");
		  int n = new java.util.Scanner(System.in).nextInt();
		  
		  while(temp>0)
		  {
			  count++;
			  temp/=10;
		  }
		  
		  while(temp >0)
		  {
			  digit = temp%10;
			  int power = 1;
			  
			  for(int i=1; i<=count; i++)
			  {
				  power*=digit;
				  sum+=power;
				  temp/=10;
			  }
		  }
		  if(sum == n)
		  {
			  System.out.print("Armstrong Number");
		  }
		  else
		  {
			    System.out.print("Not Armstrong Number");
		  }
	  }

}