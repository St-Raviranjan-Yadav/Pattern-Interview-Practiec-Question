class SortArray {
    void  main() {
        int x[] = {5, 2, 9, 1, 3};

        sort(x);

        System.out.print("Sorted array: ");
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    static void sort(int x[]) {
        for(int i = 0; i < x.length - 1; i++) {
            for(int j = 0; j < x.length - 1 - i; j++) {
                if(x[j] > x[j+1]) {
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
    }
}
