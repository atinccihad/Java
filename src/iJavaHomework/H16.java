package iJavaHomework;

import java.util.Scanner;

public class H16 {
    public static void main(String[] args) {
        /*
         * Problem tanimi :
         *
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Aldiginiz urun adedini ve liste fiyatini giriniz");
        int urunAdedi = scan.nextInt();
        double listeFiyati = scan.nextDouble();
        System.out.println("Musteri kartiniz varsa TRUE yoksa FALSE giriniz");
        boolean musteriKarti = scan.nextBoolean();

        if (musteriKarti) {
            if (urunAdedi >= 10) {
                System.out.println("%20 indirim hakki kazandiniz odemeniz gereken tutar= " + (urunAdedi * listeFiyati) * 80 / 100);
            } else {
                System.out.println("%15 indirim hakki kazandiniz odemeniz gereken tutar= " + (urunAdedi * listeFiyati) * 85 / 100);
            }
        } else {
            if (urunAdedi >= 10) {
                System.out.println("%15 indirim hakki kazandiniz odemeniz gereken tutar= " + (urunAdedi * listeFiyati) * 85 / 100);
            } else {
                System.out.println("%10 indirim hakki kazandiniz odemeniz gereken tutar= " + (urunAdedi * listeFiyati) * 90 / 100);
            }
        }
    }
}
