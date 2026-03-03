/*

        *
      * *
    * * *
  * * * *
* * * * *

*/




class pattern20{
    void main(){
        int i, j, space;

        for(i = 1; i <= 5; i++){

            // space print
            for(space = 1; space <= 5 - i; space++){
                System.out.print("  ");
            }

            // star print
            for(j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
