
//2.Take two int values from user and print greatest among them.


class day2{
   void main(){
    
	System.out.print("Enter the first Number :");
	 int num1=new java.util.Scanner(System.in).nextInt();
	
	System.out.print("Enter the Second number :");
	 int num2=new java.util.Scanner(System.in).nextInt();
    
	if (num1 > num2) 
	    {
            System.out.println("The greatest number is: " + num1);
        } 
		else if (num2 > num1) 
		{
            System.out.println("The greatest number is: " + num2);
        } 
		
		else 
		{
            System.out.println("Both numbers are equal.");
        }
   }



}