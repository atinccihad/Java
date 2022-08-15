package i44_collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class R03 {
    public static void main(String[] args) {
        /*
        Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım

        LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz

        ```
        Beklenen Çıktı:
        ```

        ```
        Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
        ```

        ```
        Listenin ilk elemani: sari
        ```

        ```
        listenin son elemani: beyaz
        ```
         */
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("sari");
        linkedList.add("mavi");
        linkedList.add("turuncu");
        linkedList.add("siyah");
        linkedList.add("yesil");
        linkedList.add("beyaz");
        ListIterator iterator = linkedList.listIterator();
        System.out.println("Orjinal list elemanlari: " + linkedList);
        System.out.println("Listenin ilk elemani: " + linkedList.iterator().next());
        System.out.println("listenin son elemani: " + (linkedList.getLast()));
    }
}
