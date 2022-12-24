package iJavaHomework;

import java.util.Scanner;

public class H28 {
    public static void main(String[] args) {
        /*
         * Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
         * olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf
         * değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen
         * harfi büyük yada küçüklüğüne duyarlıdır.)
         *
         * Sesli harfler: a,e,i,o,u
         *
         * Test Data: a
         *
         * Beklenen Çıktı: a harfi sesli harfdir.
         *
         * Test Data: d
         *
         * Beklenen Çıktı: d harfi sesiz harftir.
         *
         * Test Data: we yada %
         *
         * Beklenen Çıktı: Yanlis karakter girdiniz!
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        String strHarf = scan.nextLine();
        if (strHarf.length() != 1) {
            System.out.println("Programin dogru calismasi icin 1 karakter giriz");
        } else {
            char krk = strHarf.charAt(0);
            if (krk >= 'A' && krk <= 'Z') {
                if (krk == 'A' || krk == 'E' || krk == 'I' || krk == 'O' || krk == 'U') {
                    System.out.println(krk + " buyuk sesli harftir");
                } else {
                    System.out.println(krk + " buyuk sessiz harftir");
                }

            } else if (krk >= 'a' && krk <= 'z') {
                if (krk == 'a' || krk == 'e' || krk == 'i' || krk == 'o' || krk == 'u') {
                    System.out.println(krk + " kucuk sesli harftir");
                } else {
                    System.out.println(krk + " kucuk sessiz harftir");
                }

            } else {
                System.out.println("Yanlis karakter girdiniz!");
            }
        }
    }
}
