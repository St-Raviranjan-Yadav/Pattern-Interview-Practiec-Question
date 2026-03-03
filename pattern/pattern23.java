
/*


5
44
333
2222
11111


*/


class day22{
  void main()
  {
    int i,j;
	  System.out.print("Enter the number: ");
         int no = new java.util.Scanner(System.in).nextInt();
        for(i = 1; i<=no; i++){
			int num= no-i+1;
		   for(j = 1; j<=i; j++){
				
			   System.out.print(num);
			   
		   }
		   System.out.println();
		}
		
   }

}