package i05_mathematicalOperations;

import java.util.Scanner;

public class R01 {
    public static void main(String[] args) {
        /*
        Girilen zamanı saniyeye çeviren bir program yazınız.

        Örnek Çıktı:

        1 saat 10 dakika 50 saniye ==>

        4250 saniye
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Saniyeye cevrilmesini istediginiz saati giriniz");
        int saat = scan.nextInt();
        System.out.println("Saniyeye cevrilmesini istediginiz dakikayi giriniz");
        int dakika = scan.nextInt();
        System.out.println("Saniye giriniz");
        int saniye = scan.nextInt();

        System.out.println(saat + " saat " + dakika + " dakika " + saniye + " saniye ==> " + (saat * 3600 + dakika * 60 + saniye) + " saniye");


    }
}
