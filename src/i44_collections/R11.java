package i44_collections;

import java.util.TreeSet;

public class R11 {
    public static void main(String[] args) {
        /*
        Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

        TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe
        ```
        Beklenen Çıktı:
        ```
        ```
        Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
        ```
        ```
        ilk elemen: kirmizi
        ```
        ```
        son eleman: yesil
        ```
         */
        TreeSet<String>treeSet=new TreeSet<>();
        treeSet.add("sari");
        treeSet.add("mavi");
        treeSet.add("yesil");
        treeSet.add("kirmizi");
        treeSet.add("turuncu");
        treeSet.add("pembe");
        System.out.println("Orjinal Tree: "+treeSet);
        System.out.println("ilk eleman: "+treeSet.first());
        System.out.println("son eleman: "+treeSet.last());
    }
}
