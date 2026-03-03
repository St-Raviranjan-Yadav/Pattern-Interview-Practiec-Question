 /*4. A company decided to give bonus of 5% to employee if his/her year of service is more than 5
years.
Ask user for their salary and year of service and print the net bonus amount.*/
 
 
    class day4{
	
	void main(){
	int totalsalary=0;
	
	System.out.println("Enter the Salary");
	int s1=new java.util.Scanner(System.in).nextInt();
	System.out.println("Enter the Year of Working");
	int y1=new java.util.Scanner(System.in).nextInt();
	
	if(y1>5){
	totalsalary=(s1)+(s1*5)/100;
	System.out.println("Total Salary: " +totalsalary);
	}
	else{
	System.out.println("No bonus. You need more than 5 years of service.");
	
	}

	}
	
	}