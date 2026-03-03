 /*
1 0 1 0 1
0 1 0 1
0 1 0
0 1
1

 
 
 */
 
 
 
 class Pattern28{
    public static void main(String[] args) {

        int n = 5;  // total rows

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {

                // First row
                if (i == 1) {
                    if (j % 2 == 1)
                        System.out.print("1 ");
                    else
                        System.out.print("0 ");
                }

                // Second row
                else if (i == 2) {
                    if (j % 2 == 1)
                        System.out.print("0 ");
                    else
                        System.out.print("1 ");
                }

                // Third row
                else if (i == 3) {
                    if (j % 2 == 1)
                        System.out.print("0 ");
                    else
                        System.out.print("1 ");
                }

                // Fourth row
                else if (i == 4) {
                    if (j % 2 == 1)
                        System.out.print("0 ");
                    else
                        System.out.print("1 ");
                }

                // Fifth row
                else if (i == 5) {
                    System.out.print("1 ");
                }
            }

            System.out.println();
        }
    }
}