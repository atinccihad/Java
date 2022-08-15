package i24_i01_anOverview;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        /*
        31----
        Saati saniyeye çeviren java methodunu yazınız.

        Test Data:
        howManySeconds(2);
        Beklenen çıktı:
         7200
         */
        int saat = 1;
        saatiSaniyeyeCevir(saat);


    }

    private static void saatiSaniyeyeCevir(Integer saat) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Saniyeye cevirmek icin saat giriniz, once girdiginiz sayinin dakika miktari ekrana gelecektir");
        saat = scan.nextInt();
        System.out.println("Girilen saatin dakika miktari= " + saat * 60 + "\nGirilen saatin saniye miktari= " + saat * 60 * 60);
    }
}
