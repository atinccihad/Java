package i18_while_doWhileLoop;

import java.util.Scanner;

public class C02_whileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazdirin
         */
        int input = 5432;
        int rakamlarToplami = 0;
        int birlerBasagi = 0;
        int temp = input;
        while (temp > 0) {
            birlerBasagi = temp % 10;
            rakamlarToplami += birlerBasagi;
            temp /= 10;
        }
        System.out.println(input + " sayisinin rakamlar toplami : " + rakamlarToplami);
    }
}
