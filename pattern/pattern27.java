/*
1
21
321
4321
54321

*/

class day27{
   
     void main(){
         int i,j;

        System.out.print("Enter the no: ");		 
 	    int no =new java.util.Scanner(System.in).nextInt();

       
        for(i = 1; i <= no; i++) {

            for(j = i; j >= 1; j--) {
                System.out.print(j);
            }
			System.out.println();
           }	   
	  
     }
  }