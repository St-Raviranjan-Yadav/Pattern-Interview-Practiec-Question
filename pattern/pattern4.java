/*

12345
678910
1112131415
1617181920
2122232425


*/

class Pattern {
    public static void main(String[] args) {

        int n = 5;
        int num = 1;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {
                System.out.print(num);
                num++;
            }

            System.out.println();
        }
    }
}
