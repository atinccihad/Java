package i21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        Binary search java'da eleman aramanin kisa yoludur
        ancak binary search'in calismasi icin once
        Array'in sirali hale getirilmesi gerekir
        Eger siralama yapmadan binary search yaparsaniz
        sonucu bulamayabilir veya yanlis bulabilir
         */
        String[] harfler = {"Y", "B", "D", "G", "O", "A"};
        String arananHarf = "Y";

        Arrays.binarySearch(harfler, arananHarf);
        C03_contains.contains(harfler, arananHarf);

        // Arrays.binarySearch() bize aradigimiz elemanin index'ini dondurur

        System.out.println(Arrays.binarySearch(harfler, arananHarf)); // -6
        // Array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        // Emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler, arananHarf));


    }
}
