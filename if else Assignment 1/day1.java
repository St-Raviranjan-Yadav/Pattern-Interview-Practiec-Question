
//1.Take values of length and breadth of a rectangle from user and if it is Square or not.


class  day1{
     void main()
	 {
		 System.out.print("Enter Length: ");
	     int length=new java.util.Scanner(System.in).nextInt();

	     System.out.print("Enter Breath: ");
	     int breadth=new java.util.Scanner(System.in).nextInt();

        
        if (breadth == length) {
			System.out.println("It is a Square.");
         }    
		else {
            System.out.println("It is a Rectangle.");
        }
    }
}
