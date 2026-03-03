class MatrixTranspose {
    void main() {

        int a[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        metrixtranspose(a);
    }

    static void metrixtranspose(int x[][]) {
        int r = x.length;
        int c = x[0].length;

        int t[][] = new int[c][r];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                t[j][i] = x[i][j];
            }
        }

        // print transpose
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}
