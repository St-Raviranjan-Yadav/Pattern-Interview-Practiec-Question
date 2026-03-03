/*8. A Student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
Number of classes held
number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not. 

*/

class day8{
   void main() {
       int per = 0;
        System.out.print("Number of classes held: ");
        int held= new java.util.Scanner(System.in).nextInt();

        System.out.print("Number of classes attended: ");
        int attended= new java.util.Scanner(System.in).nextInt();

        per = ( held * attended )/100;
   
        System.out.println("Percentage of class attended: " + per + "%");

        if (per >= 75) {
            System.out.println("Student is allowed to sit in the exam.");
        } 

       else {
            System.out.println(" Student is not allowed in exam.");
        }

    }
}
