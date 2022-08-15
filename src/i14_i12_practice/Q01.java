package i14_i12_practice;

import java.util.Scanner;

public class Q01 {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cumle olusturmak icin 1. kelimeyi giriniz");
        String birinciKelime = scan.next().toLowerCase();
        System.out.println("2. kelimeyi giriniz");
        String ikinciKelime = scan.next().toLowerCase();
        System.out.println("3. kelimeyi giriniz");
        String ucuncuKelime = scan.next().toLowerCase();
        System.out.println("4. kelimeyi giriniz");
        String dorduncuKelime = scan.next().toLowerCase();
        System.out.println(birinciKelime.substring(0, 1).toUpperCase() + birinciKelime.substring(1) + ", "
                + ikinciKelime + ", "
                + ucuncuKelime + ", "
                + dorduncuKelime + ".");
    }
}
