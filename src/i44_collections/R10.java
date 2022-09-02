package i44_collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class R10 {
    public static void main(String[] args) {
        /*
        Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından
        descendingIterator()
        fonksiyonunu kullanarak ters sıradan yazdıralım.
        TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi

        ```
        Beklenen Çıktı:

        Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]

        Tersten Siralanisi:

        yesil

        turuncu

        sari

        mavi

        kirmizi
         */
        TreeSet<String>treeSet=new TreeSet<>();
        treeSet.add("yesil");
        treeSet.add("sari");
        treeSet.add("mavi");
        treeSet.add("turuncu");
        treeSet.add("kirmizi");
        System.out.println("Orjinal Tree sonucu: "+treeSet);
        Iterator iterator= treeSet.descendingIterator();







    }
}
