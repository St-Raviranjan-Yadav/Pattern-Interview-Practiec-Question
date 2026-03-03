
/*

1
01
010
0101
01010


*/


class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {

                // First row special case
                if(i == 1) {
                    System.out.print("1");
                }
                else {
                    if(j % 2 == 1)
                        System.out.print("0");
                    else
                        System.out.print("1");
                }
            }

            System.out.println();
        }
    }
}
