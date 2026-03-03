/*3.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/



  class day3{
   void main(){
   int totalCost = 0;
   System.out.print("Enter the quantity: ");
   int quantity=new java.util.Scanner(System.in).nextInt();
   
    totalCost = quantity * 100;
   
   if(totalCost >= 1000){
   
   int disCont = 0;
   disCont  = (totalCost-10)/100;
   totalCost = totalCost - disCont;
   System.out.println("You got a 10% discont.");
  
  }
   else{
    System.out.println("No Discount applied for purchased  of 1000 or less ");
	 }
    System.out.println("Total Cost is: " +totalCost);
   }
 
  }