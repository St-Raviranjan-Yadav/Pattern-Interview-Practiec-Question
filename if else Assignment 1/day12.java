/* 

12. Write a program to check if a year is leap year or not.
  
If a year is divisible by 4 then it is leap year but if the year is century year like 2000,
1900, 2100 then it must be divisible by 400.

*/

class day12{
 
 void main(){
 
  System.out.print("Enter th Year: ");
  int year = new java.util.Scanner(System.in).nextInt();
  
  if(year%4==0){
    System.out.print("Leap year: "+year);
  }
  else if(year%100==0){
   System.out.print("Leap Not year: "+year);
  }
  else if(year%400==0){
   System.out.print("Leap Year: "+year);
  }
  
  else{
  System.out.println("Only year Not Alphbet, Symbole");
  }
 }


}