package i21_Arrays;

import java.util.Arrays;

public class C05_addToElementArray {
    public static void main(String[] args) {
        // Array'e yeni bir element ekleyen method olusturun
        String[] sinifListesi = {"Ali Can", "Nida Yucedal", "Musa Yaman"};
        String eklenecekIsim = "Murat Babayigit";

        sinifListesi = elemanEkle(sinifListesi, eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String[] yeniSinifListesi = new String[sinifListesi.length + 1]; // [null, null, null, null]
        for (int i = 0; i < sinifListesi.length; i++) {
            yeniSinifListesi[i] = sinifListesi[i];
        }
        yeniSinifListesi[yeniSinifListesi.length - 1] = eklenecekIsim;
        return yeniSinifListesi;
    }
}
