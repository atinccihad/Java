package i23_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        List<String> eskiUrunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);
        System.out.println(urunler); // [Cay, Cekirdek, Ikram, Nutella]

        /*
        List ile gelen sort methodunda siralama ozelligini girmek gerekiyor
        Bunun yerine Collections class'indan sort methodunu kullaniyoruz
        bu method listemizi natural order'a gore siralar
         */


    }
}
