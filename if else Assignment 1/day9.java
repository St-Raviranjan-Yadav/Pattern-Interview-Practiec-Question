/*
9. Modify the above question to allow student to sit if he/she has medical cause. Ask user if
he/she has medical cause or not ('Y' or 'N') and print accordingly.

*/


class day9{

 void main(){
    int per = 0;
        System.out.print("Number of classes held: ");
        int held= new java.util.Scanner(System.in).nextInt();

        System.out.print("Number of classes attended: ");
        int attended= new java.util.Scanner(System.in).nextInt();

        per = ( held * attended )/100;
   
        System.out.println("Percentage of class attended: " + per + "%");


       if (per >= 75) {
            System.out.println("You are allowed to sit in the exam.");
        } 
       
      else{
        System.out.print("Do you have a medical cause? (Y/N): ");
      char medical= new java.util.Scanner(System.in).next().charAt(0);

      if(medical == 'Y' || medical == 'y'){
         System.out.println("Allowed to sit due to medical cause.");
        }

     else{
      System.out.println("Not allowed to sit in the exam.");
      }

   }
  }
}