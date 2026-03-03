
/*10.If
x = 2
y = 5
z = 0
then find values of the following expressions:
a. x == 2
b. x != 5
c. x != 5 && y >= 5
d. z != 0 || x == 2
e. !(y < 10) */


class day10{
     void main() {
        
        int x = 2;
        int y = 5;
        int z = 0;

        System.out.println("a. x == 2 : " + (x == 2));
        System.out.println("b. x != 5 : " + (x != 5));
        System.out.println("c. x != 5 && y >= 5 : " + (x != 5 && y >= 5));
        System.out.println("d. z != 0 || x == 2 : " + (z != 0 || x == 2));
        System.out.println("e. !(y < 10) : " + (!(y < 10)));
    }
}


