package i44_collections;

import java.util.HashSet;
import java.util.TreeSet;

public class R09 {
    public static void main(String[] args) {
        /*
        Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.
        HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
        ```
        Beklenen Çıktı:
        ```
        Tree Set Elemanlari:
        ```
        kirmizi
        ```
        mavi
        ```
        sari
        ```
        turuncu
        ```
        yesil
         */
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("sari");
        hashSet.add("mavi");
        hashSet.add("yesil");
        hashSet.add("turuncu");
        hashSet.add("kirmizi");
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.addAll(hashSet);
        System.out.println(treeSet);


    }
}
