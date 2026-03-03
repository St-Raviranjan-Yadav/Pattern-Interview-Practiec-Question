/*


1
22
333
4444
55555



*/

class day22{
  void main()
  {
    int i,j;
	  System.out.print("Enter the number: ");
         int no = new java.util.Scanner(System.in).nextInt();
        for(i = 1; i<=no; i++){
		   for(j = 1; j<=i; j++){
		       
			   System.out.print(i);
			   
		   }
		   System.out.println();
		}
		
   }

}