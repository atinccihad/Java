package i23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        List<String> eskiUrunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.indexOf("Ikram")); // 1
        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]

        /*
        indexOf methodu bize bilgi donduren bir methoddur listemizi degistirmez
         */

        urunler.lastIndexOf("Ikram");
        /*
        indexOf methodu urunu aramya 0. index den
        lastIndexOf metgodu ise aramaya son indexden baslar
        arama bitip urun bulundugunda
        ikiside ayni indexi verir
         */

        urunler.add("Ikram");
        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.indexOf("Ikram")); // 1
        System.out.println(urunler.lastIndexOf("Ikram")); // 4

        System.out.println(urunler.indexOf("Hobby")); // -1
        System.out.println(urunler.lastIndexOf("Hobby")); // -1

    }
}
