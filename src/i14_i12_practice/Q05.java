package i14_i12_practice;

import java.util.Scanner;

public class Q05 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi ve soyisminizi giriniz");
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();

        if (isim.length() > soyisim.length()) {
            System.out.println("Ismin uzunlugu soyisimden buyuk");
        } else if (soyisim.length() > isim.length()) {
            System.out.println("Soyisimin uzunlugu isimden buyuk");
        } else {
            System.out.println("Isim soyisim uzunlugu esit");
        }
    }
}
