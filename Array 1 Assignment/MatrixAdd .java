class MatrixAdd {
    void main() {

        int a[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int b[][] = {
            {7, 8, 9},
            {1, 2, 3}
        };

        metrixadd(a, b);
    }

    static void metrixadd(int x[][], int y[][]) {
        int r = x.length;
        int c = x[0].length;

        int z[][] = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                z[i][j] = x[i][j] + y[i][j];
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
    }
}
