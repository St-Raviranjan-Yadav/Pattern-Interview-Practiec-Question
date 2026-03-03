class IntersectionArray {
    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4};
        int y[] = {3, 4, 5, 6};

        intersection(x, y);
    }

    static void intersection(int x[], int y[]) {
        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < y.length; j++) {
                if(x[i] == y[j]) {
                    System.out.print(x[i] + " ");
                    break;
                }
            }
        }
    }
}
