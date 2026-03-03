

class HappyNo{
	void main(){
		
		System.out.print("Enter a number: ");
	int n = new java.util.Scanner(System.in).nextInt();
	int original = n;

     while(n != 1 && n != 4){
         int sum = 0;
		 
		 while (n > 0){
			 int digit = n%10;
			 sum =sum+(digit*digit);
			 n = n/10;
			 
		 }
		 n=sum;
	 }		 
	 
	 if(n == 1){
		 System.out.print("Happy Number:"+original);
	 }
	 else{
		 System.out.print("Is Not Happy Number: "+original);
	 }
	
	}
}