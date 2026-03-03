

/*

12345
1234
123
12
1


*/

class Pattern5{

 void main(){
  int i, j, rows;
 System.out.print("Enter the number of rows: ");
 rows = new java.util.Scanner(System.in).nextInt();
 
 for(i =rows; i>=1; --i)
 {
    for(j=1; j<=i; ++j)
	{
	System.out.print(j);
	}
	System.out.println();
 }
 }

}