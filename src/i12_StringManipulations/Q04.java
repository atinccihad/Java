package i12_StringManipulations;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
        Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isiminizi\nardindan soyisminizi giriniz.");
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();

        if (isim.length() > soyisim.length()) {
            System.out.println("Girilen ismin karakter sayisi soyisimin karakter sayisindan fazla.");
        } else if (isim.length() == soyisim.length()) {
            System.out.println("Girilen ismin karakter sayisi soyisimin karakter sayisina esit.");
        } else {
            System.out.println("Girilen ismin karakter sayisi soyisimin karakter sayisindan daha az.");
        }
    }
}
