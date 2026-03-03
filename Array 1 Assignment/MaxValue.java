class MaxArray {
     void main() {
        int x[] = {12, 45, 7, 90, 34};

        int max = x[0];  // pehla element max maana

        for(int i = 1; i < x.length; i++) {
            if(x[i] > max) {
                max = x[i];
            }
        }

        System.out.println("Sabse bada number = " + max);
    }
}
