package i44_collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class R07 {
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
          ``
          ```
          sari
          ```
         */
        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("sari");
        linkedList.add("mavi");
        linkedList.add("yesil");
        linkedList.add("kirmizi");
        linkedList.add("beyaz");
        linkedList.add("mor");
        ListIterator <String>iterator= linkedList.listIterator();

        for (int i = linkedList.size()-1; i >=0 ; i--) {
            System.out.println(linkedList.get(i));
        }


    }
}
