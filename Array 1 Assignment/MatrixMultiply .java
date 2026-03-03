class MatrixMultiply {
    void main(){

        int a[][] = {
            {1, 2},
            {3, 4}
        };

        int b[][] = {
            {5, 6},
            {7, 8}
        };

        metrixmult(a, b);
    }

    static void metrixmult(int x[][], int y[][]) {
        int r1 = x.length;
        int c1 = x[0].length;
        int c2 = y[0].length;

        int z[][] = new int[r1][c2];

        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    z[i][j] += x[i][k] * y[k][j];
                }
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
    }
}
