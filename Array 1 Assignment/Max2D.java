class Max2D {
    void  main() {
        int a[][] = {
            {10, 25, 8},
            {44, 5, 19},
            {7, 88, 2}
        };

        System.out.println("Maximum = " + max(a));
    }

    static int max(int x[][]) {
	
        int m = x[0][0];  // pehla element max maana

        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[i].length; j++) {
                if(x[i][j] > m) {
                    m = x[i][j];
                }
            }
        }
        return m;
    }
}
