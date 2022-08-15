package i21_Arrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        // C05'deki methodu kullanarak Array'e eleman ekleyelim

        String[] takimListesi = {"Suleyman", "Osman"};
        String eklenecekIsim = "Talha";

        C05_addToElementArray.elemanEkle(takimListesi, eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi)); // [Suleyman, Osman]
    }
}
