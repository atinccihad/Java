package i44_collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class R04 {
    public static void main(String[] args) {
        /*
        Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.

         LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

         ```
         Beklenen Çıktı:
         ```

         ```
         Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
         ```

         ```
         LinkedList Tersi:
         ```

         ```
         mor
         ```

         ```
         beyaz
         ```

         ```
         kirmizi
         ```

         ```
         yesil
         ```

         ```
         mavi
         ```

         ```
         sari
         ```
         */
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("sari");
        linkedList.add("mavi");
        linkedList.add("yesil");
        linkedList.add("kirmizi");
        linkedList.add("beyaz");
        linkedList.add("mor");
        ListIterator<String> iterator = linkedList.listIterator();

        int index= linkedList.size()-1;

        while (iterator.hasPrevious()){
            if (index>=0){
                System.out.println(linkedList.get(index));

            }
            index--;
        }
    }
}
