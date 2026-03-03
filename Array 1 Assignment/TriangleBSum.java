class TriangleBsum {
    void main(){

        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        triangleBsum(a);
    }

    static void triangleBsum(int x[][]) {
        int n = x.length;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) { // lower triangle condition
                sum += x[i][j];
            }
        }

        System.out.println("Lower triangular sum = " + sum);
    }
}
