package i11_i09_practice;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String str = scan.next();

        if (str.length() > 2) {
            System.out.print(str.substring(str.length() - 2, str.length()) +
                    str.substring(str.length() - 2, str.length()) +
                    str.substring(str.length() - 2, str.length()));
        } else {
            System.out.println(str);
        }
    }
}
