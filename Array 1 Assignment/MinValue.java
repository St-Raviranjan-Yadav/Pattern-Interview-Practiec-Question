class MinArray {
    void main() {
        int x[] = {12, 45, 7, 90, 34};

        int min = x[0];  // pehla element min maana

        for(int i = 1; i < x.length; i++) {
            if(x[i] < min) {
                min = x[i];
            }
        }

        System.out.println("Sabse chhota number = " + min);
    }
}
