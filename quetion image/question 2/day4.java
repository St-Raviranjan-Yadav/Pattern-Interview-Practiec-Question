

class Day4{
  void main()
  {
   int fact = 1;
   System.out.print("Enter the num: ");
     int num = new java.util.Scanner(System.in).nextInt();
   for(int i =1; i<=num; i++){
        fact =fact*i;
		System.out.println(fact);
   
   }
System.out.println("Facotrial sum: "+fact);
  
  }
}