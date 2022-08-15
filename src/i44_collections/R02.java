package i44_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class R02 {
    public static void main(String[] args) {
        /*
        bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

        LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

        1. elemandan itibaren yazdıralım.

        ```
         Beklenen Çıktı:
        ```

        ```
        beyaz
        ```

        ```
        mavi
        ```

        ```
        yesil
        ```

        ```
        turuncu
        ```
         */

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("sari");
        linkedList.add("beyaz");
        linkedList.add("mavi");
        linkedList.add("yesil");
        linkedList.add("turuncu");
        ListIterator<String> li1 = linkedList.listIterator();

        for (int i = 1; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
            li1.next();
        }


    }
}
