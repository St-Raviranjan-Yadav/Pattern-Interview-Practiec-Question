
 /* 7.Write a program to print absolute value of a number entered by user. E.g.-

INPUT: 1                OUTPUT: 1
INPUT: -1               OUTPUT:1

*/


   class day7{
   
    public static void main(){
	System.out.println("Enter the Value");
	int n1 = new java.util.Scanner(System.in).nextInt();
	
	if(n1>=1)
	System.out.println(+n1);
	
	else
	System.out.println(-(n1));
	
	}
   }