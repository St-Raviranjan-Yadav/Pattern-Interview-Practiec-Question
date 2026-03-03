
/*
Enter the alphbte character:  E

EEEEE
DDDDD
CCCCC
BBBBB
AAAAA

*/
class day17{


   void main(){
         System.out.print("Enter alphabet uppercase character: ");
       char cha= new java.util.Scanner(System.in).next().charAt(0);
	   
	   for(char i = cha; i >= 'A'; i--){
	         for(int j = 1; j <= 5;  j++){
	             System.out.print(i);
			 }
	   System.out.println();
	     
	   }
   }

}