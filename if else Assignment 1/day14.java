/*14.Take three values from the user and print then in ascending order.*/

class day14{

void main(){
  int temp = 0;
 System.out.print("Enter first number: ");
 int a = new java.util.Scanner(System.in).nextInt(); 
 
 
 System.out.print("Enter second number: ");
 int b = new java.util.Scanner(System.in).nextInt(); 
 
 System.out.print("Enter Third number: ");
 int c = new java.util.Scanner(System.in).nextInt(); 
 
 if(a>b){
   temp =a;
   a = b;
   b = temp;
 }
 
  if(a>c){
   temp = b;
   a = c;
   c = temp;
 }
 
  if(c>b){
   temp =c;
   c = a;
   a = temp;
 }
 
 System.out.println("Ascending order : "+a+","+b+","+c);
 

 
}

}