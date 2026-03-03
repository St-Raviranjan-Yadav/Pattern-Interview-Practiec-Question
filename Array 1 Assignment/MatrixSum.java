class MatrixSum {
    void main() {

        int a[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };

        metrixsum(a);
    }

    static void metrixsum(int x[][]) {
        int sum = 0;

        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[i].length; j++) {
                sum += x[i][j];
            }
        }

        System.out.println("Matrix ka sum = " + sum);
    }
}
