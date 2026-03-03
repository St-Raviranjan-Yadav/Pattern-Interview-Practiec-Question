class UnionArray {
   void main() {
        int x[] = {1, 2, 3, 4};
        int y[] = {3, 4, 5, 6};

        union(x, y);
    }

    static void union(int x[], int y[]) {

        // Pehle x ke elements print
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

        // y ke sirf wo elements print jo x me nahi hain
        for(int i = 0; i < y.length; i++) {
            boolean found = false;

            for(int j = 0; j < x.length; j++) {
                if(y[i] == x[j]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.print(y[i] + " ");
            }
        }
    }
}
