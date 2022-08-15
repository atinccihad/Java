package i44_collections;

import java.util.LinkedList;

public class R01 {
    public static void main(String[] args) {
        /*
        Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
        LinkedList elemanları: sari,mavi,mor,yesil,beyaz
        ```
        Beklenen Çıktı:
        ```
        sari
        ```
        mavi
        ```
        mor
        ```
        yesil
        ```
        beyaz
        ```
         */
        LinkedList<String> colours = new LinkedList<>();
        colours.add("sari");
        colours.add("mavi");
        colours.add("mor");
        colours.add("yesil");
        colours.add("beyaz");

        System.out.println(colours.get(0));
        System.out.println(colours.get(1));
        System.out.println(colours.get(2));
        System.out.println(colours.get(3));
        System.out.println(colours.get(4));
    }
}
