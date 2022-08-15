package i24_i01_anOverview;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        /*
        18----
        Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.

        Test Data:
        java is fun

        Beklenen Çıktı:

        Stringdeki sesli harf sayısı: 4
         */
        String str = "";
        ;
        harfSayisi(str);


    }

    private static void harfSayisi(String str) {
        String[] arr = {"a", "e", "i", "o", "u"};
        String[] strArr = {};
        int sesliHarfSayisi = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz");
        str = scan.nextLine();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals(arr[i])) {
                sesliHarfSayisi++;
            }
        }
        System.out.println("Stringdeki sesli harf sayısı: " + (sesliHarfSayisi + 1));

    }
}
