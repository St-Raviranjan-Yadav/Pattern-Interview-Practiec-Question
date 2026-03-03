class Sort2D {
      void main() {
        int a[][] = {
            {5, 2, 9},
            {1, 3, 7}
        };

        sort(a);

        System.out.println("Sorted Matrix:");
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sort(int x[][]) {
        int rows = x.length;
        int cols = x[0].length;

        for(int k = 0; k < rows * cols; k++) {
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {

                    int ni = i, nj = j + 1;

                    if(nj == cols) {   // next column end ho gaya
                        ni = i + 1;
                        nj = 0;
                    }

                    if(ni < rows && x[i][j] > x[ni][nj]) {
                        int temp = x[i][j];
                        x[i][j] = x[ni][nj];
                        x[ni][nj] = temp;
                    }
                }
            }
        }
    }
}
