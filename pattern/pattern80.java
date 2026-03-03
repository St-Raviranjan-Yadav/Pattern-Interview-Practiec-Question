
/*
*******
*****
***
*

*/



class Pattern {
    public static void main(String[] args) {

        int stars = 7;

        for(int i = stars; i >= 1; i -= 2) {   // 8,6,4,2 (lekin hume 7,5,3,1 chahiye)
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
