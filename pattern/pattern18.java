/*
EDCBA
EDCBA
EDCBA
EDCBA
EDCBA

*/

class day18{
  void main(){
   
   System.out.print("Enter the number: ");
   char cha = new java.util.Scanner(System.in).next().charAt(0);
   
   for (int i = 1 ; i<=5; i++){
      for(char j = cha; j>='A'; j--){
	  System.out.print(j);
	  System.out.print(" ");
	  }
	  System.out.println();
   }
  }

}