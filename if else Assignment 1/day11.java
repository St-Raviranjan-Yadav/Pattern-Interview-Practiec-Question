/*11.write a program to check whether a entered character is lowercase (a to z) or Uppercase
(A to z).*/


class day11{
    void main(){
         System.out.print("Enter any character: ");
         char cha = new java.util.Scanner(System.in).next().charAt(0);
  
         if (cha >= 'A' && cha <= 'Z') {
            
            System.out.println("Uppercase letter: " +cha);
        } 
        else if(cha >= 'a' && cha <= 'z'){
            System.out.println("Lowercase letter: " +cha);
        }
       
        else{
         System.out.println("The entered character is not alphabet.");
        }
 }
  }