

class day5{
  void main(){
	  int pow=0;
      System.out.print("Enter a First num: ");
     int num = new java.util.Scanner(System.in).nextInt();
      pow=num;
  System.out.print("Enter a Second num: ");
     int no = new java.util.Scanner(System.in).nextInt();
  
  for(int i=1; i<no; i++)
  {
	   pow=pow*num;
  } 
  System.out.println(pow);
  }


}