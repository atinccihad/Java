package i18_while_doWhileLoop;

public class H01 {
    public static void main(String[] args) {
        // While loop kullanarak 3'den 13'e kadar tum tek sayilari yazdiriniz.
        int num1 = 3;
        int num2 = 13;

        while (num2 >= num1) {
            if (num1 % 2 == 1) {
                System.out.print(num1 + "  ");
            }
            num1++;
        }
    }
}
