/*

1
2332
345543
45677654
5678998765

*/

class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            // increasing part
            for(int j = i; j <= 2*i - 1; j++) {
                System.out.print(j);
            }

            // decreasing part
            for(int j = 2*i - 1; j >= i; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
