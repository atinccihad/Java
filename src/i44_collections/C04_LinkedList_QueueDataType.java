package i44_collections;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class C04_LinkedList_QueueDataType {
    public static void main(String[] args) {

        Queue<String> ll3 = new LinkedList();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        // Queue kuyruk demektir, sira onemlidir
        // gelen sona gelir, giden bastan gider

        System.out.println(ll3); // [Adem, Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove()); // Adem

        System.out.println(ll3); // [Zeynep, Hpolat, Kadir]

        System.out.println(ll3.remove("Hpolat")); // true

        System.out.println(ll3); // [Zeynep, Kadir]

        System.out.println(ll3.element()); // Zeynep

        System.out.println(ll3.peek()); // Zeynep

        System.out.println(ll3.remove("Zeynep"));

        Queue<String> ll4 = new LinkedList();
        // System.out.println(ll4.element());   NoSuchElementException
        System.out.println(ll4.peek()); // null
        /*
        peek ve element silmeden ilk elementi bize dondurur
        aralarindaki fark bos liste olursa peek null doner
        element exception firlatir
         */
        ll3.offer("Ahmet");
        ll3.offer("Selin");
        System.out.println(ll3); // [Kadir, Ahmet, Selin]

        System.out.println(ll3.poll()); // Kadir
        System.out.println(ll3); // [Ahmet, Selin]


        try {
            ll4.remove(); // NoSuchElementException
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException");
        }
        System.out.println(ll4.poll()); // null
    }
}
