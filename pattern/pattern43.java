
/*

54321
5432
543
54
5

*/



class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = n; i >= 1; i--) {

            for(int j = n; j >= n - i + 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
