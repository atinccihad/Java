package i44_collections;

import java.util.TreeSet;

public class R08 {
    public static void main(String[] args) {
        /*
        Bir TreeSet oluşturalım ve tüm elemanlarını tektek yazdıralım.

        TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah
        ```
        Beklenen Çıktı:
        ```
        beyaz
        kirmizi
        mavi
        sari
        siyah
        yesil
        ```
         */
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("beyaz");
        treeSet.add("kirmizi");
        treeSet.add("mavi");
        treeSet.add("sari");
        treeSet.add("siyah");
        treeSet.add("yesil");
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());

        System.out.println(treeSet.subSet(treeSet.first(), treeSet.last()));
    }
}
