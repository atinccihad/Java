package i22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        /*
        List primitive data turlerini kabul etmez
        (Type argument cannot be of primitive type)
         */
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar); // [5, 3, 7]

        // sadece add kullanirsak java sona ekler
        sayilar.add(2, 10); // indexi 2 olan yere 10 elementini ekleyelim
        System.out.println(sayilar); // [5, 3, 10, 7]

        // add(index, element) istedigimiz indexe istedigimiz elementi yerlestirir
        // add methodu eski elementleri silmez veya update etmez, yeni element ekler


    }
}
