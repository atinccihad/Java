package i23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        List<String> eskiUrunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        /*
        remove methodu 2 sekilde kullanilir
        1- objeyi yazip silmesini istersek bize boolean sonuc doner
        2- index girersek o indexdeki elemani siler ve bize silinen elemani dondurur
         */

        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.remove("Ikram")); // true
        System.out.println(urunler); // [Nutella, Cekirdek, Cay]
        System.out.println(urunler.remove("Hobby")); // false
        System.out.println(urunler); // [Nutella, Cekirdek, Cay]

        // ikinci yontemi deneyelim , index girelim

        System.out.println(urunler.remove(1)); // Cekirdek
        System.out.println(urunler); // [Nutella, Cay]

        // olmayan bir indexi silmeye calisirsak?
        // System.out.println(urunler.remove(3));    IndexOutOfBoundsException
    }
}
