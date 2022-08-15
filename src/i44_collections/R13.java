package i44_collections;

import java.util.TreeSet;

public class R13 {
    public static void main(String[] args) {
        /*
        Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.

        1. TreeSet: mavi,yesil,kirmizi,sari
        2. TreeSet: yesil,mavi,pembe,turuncu
        ```
        Beklenen Çıktı:
        ```
        ```
        1. TreeSet: [kirmizi,mavi,sari,yesil]
        ```
        ```
        2. TreeSet: [mavi,pembe,turuncu,yesil
        ```
        ```
        Karsilastirma Sonucu:
        ```
        ```
        no
        ```
        ```
        yes
        ```
        ```
        no
        ```
        ```
        yes
        ```
         */
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("kirmizi");
        treeSet1.add("mavi");
        treeSet1.add("sari");
        treeSet1.add("yesil");
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("mavi");
        treeSet2.add("pembe");
        treeSet2.add("turuncu");
        treeSet2.add("yesil");
    }
}








