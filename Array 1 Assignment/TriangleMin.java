class TriangleMin {
    void main() {

        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        triangleAmin(a);
    }

    static void triangleAmin(int x[][]) {
        int n = x.length;
        int min = x[0][0]; // assume first element as min

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) { // upper triangle condition
                if(x[i][j] < min) {
                    min = x[i][j];
                }
            }
        }

        System.out.println("Upper triangular min = " + min);
    }
}
