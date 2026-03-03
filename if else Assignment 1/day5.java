/*5. A school has following rules grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - c
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade*/

 class day5{
 
   void main(){
    System.out.print("Enter the Marks: ");
	int marks = new java.util.Scanner(System.in).nextInt();
    
     if(marks < 25){
       System.out.println("Grade: F");
       }	 
	   
	 if(marks >= 25 && marks < 45){
       System.out.println("Grade: E");
       }	
	   
	 if(marks >= 45 && marks < 50){
       System.out.println("Grade: D");
       }	

     if(marks >= 50 && marks < 60){
       System.out.println("Grade: C");
       }
	   
     if(marks >= 60 && marks < 80){
       System.out.println("Grade: B");
       }		   
	   
	 if(marks >= 80){
       System.out.println("Grade: A");
       }	
   }
 }