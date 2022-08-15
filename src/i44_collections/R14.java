package i44_collections;

import java.util.PriorityQueue;

public class R14 {
    public static void main(String[] args) {
        /*
        Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.

        priority queue elemanları: sari,yesil,mavi,kirmizi

        ```
        Beklenen Çıktı:
        ```

        ```
        Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
        ```
         */
        PriorityQueue<String>priorityQueue=new PriorityQueue<>();
        priorityQueue.add("sari");
        priorityQueue.add("yesil");
        priorityQueue.add("mavi");
        priorityQueue.add("kirmizi");
        System.out.println("Priority Queue elemanlari: "+priorityQueue);
    }
}
