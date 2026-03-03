class TriangleASum {
    public static void main(String[] args) {

        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        triangleAsum(a);
    }

    static void triangleAsum(int x[][]) {
        int sum = 0;
        int n = x.length; // square matrix

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) { // upper triangle condition
                sum += x[i][j];
            }
        }

        System.out.println("Upper triangular sum = " + sum);
    }
}
