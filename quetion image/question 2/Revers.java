

class ReversNo{
 
   void main()
{
   System.out.print("Enter a value: ");
     int num = new java.util.Scanner(System.in).nextInt();   
	  
	int revers = 0;
        for(; num>0; num=num/10) 
			revers = revers*10 + num%10;
		
        System.out.println(revers);


}	


}