/*
अगर कोई संख्या अपने digits के sum से पूरी तरह divide हो जाए (remainder = 0),
तो वह Harshad Number है।

🔢 Example 1:

18

Digits का sum = 1 + 8 = 9

अब check करो:
18 ÷ 9 = 2 (पूरी तरह divide हो गया)

👉 इसलिए 18 एक Harshad Number है ✅


🔢 Example 2:

19

Digits का sum = 1 + 9 = 10

19 ÷ 10 = 1.9 (पूरी तरह divide नहीं हुआ)

👉 इसलिए 19 Harshad Number नहीं है ❌
*/



class Harshad {
    void main() {
		   int sum = 0, t = n;
        System.out.print("Enter a number: ");
		 int n = new java.util.Scanner(System.in).nextInt();
     

        while (t > 0) {
            sum += t % 10;
            t /= 10;
        }

        if (n % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");
    }
}
