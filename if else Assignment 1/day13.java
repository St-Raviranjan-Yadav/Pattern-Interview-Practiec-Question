 /*Ask user to enter age, Sex (male & Female), marital status (Y & N) and then using following

rule print their place of service.
if employee if Female, then she will work only in urban areas.

If employee is a male and age is in between 20 to 40 then he may work in anywhere .

If employee is male and age is in between 40 to 60 then he will working urban area only.

And any other input of age should print "ERROR".*/



class day13{

   void main(){
   
     System.out.print("Enter Your Age: ");
	 int age= new java.util.Scanner(System.in).nextInt();
	 
    
	System.out.print("Enter Your Sex(M/F): ");
	char sex = new java.util.Scanner(System.in).next().charAt(0);
	
	
	 System.out.print("Enter Your marital status(Y/N): ");
     char marital = new java.util.Scanner(System.in).next().charAt(0);
	 
	 if(sex == 'F'){
	     System.out.print("Place of service: Urban Areas Only");
           
	 }
	 else if(sex == 'M'){
		 if(age >= 20 && age <= 40){
			 System.out.println("Place of service: Anywhere");
		 }
		 else if (age > 40 && age <= 60) {
                System.out.println("Place of service: Urban Areas Only");
            }
		 
	 }
	 
	 else{
	 System.out.print("Error Invalid");
	 }
   
   }

}