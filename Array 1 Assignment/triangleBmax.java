class TriangBmax {
  void main() {

        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        triangleBmax(a);
    }

    static void triangleBmax(int x[][]) {
        int n = x.length;
        int max = x[0][0]; // assume first element as max

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) { // lower triangle condition
                if(x[i][j] > max) {
                    max = x[i][j];
                }
            }
        }

        System.out.println("Lower triangular max = " + max);
    }
}
