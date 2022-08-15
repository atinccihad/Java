package iJavaHomework;

import java.util.Scanner;

public class H15 {
    public static void main(String[] args) {
        /*
         * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
         * hatali giris seklinde kod yazniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("1 harf (karakter) giriniz");
        String krkStr = scan.next();
        char krk = krkStr.charAt(0);
        if (krk >= 'a' && krk <= 'z') {
            System.out.println("Kucuk harf");
        } else if (krk >= 'A' && krk <= 'Z') {
            System.out.println("Buyuk harf");
        } else if (krk >= '1' && krk <= '9') {
            System.out.println("Rakam");
        } else {
            System.out.println("Hatali giris");
        }
    }
}
