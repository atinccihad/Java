package i46_maps;

import java.util.Iterator;
import java.util.TreeSet;

public class R02 {
    public static void main(String[] args) {
        /*
        Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.

        TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi
        ```
        Beklenen Çıktı:
        ```
        Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
        ```
        Tersten Siralanisi:
        ```
        yesil
        ```
        turuncu
        ```
        sari
        ```
        mavi
        ```
        kirmizi
         */

        TreeSet<String> colours = new TreeSet<>();
        colours.add("yesil");
        colours.add("sari");
        colours.add("mavi");
        colours.add("turuncu");
        colours.add("kirmizi");
        System.out.print("Orjinal Tree sonucu:  ");
        for (String each : colours) {
            System.out.print(each + " ");
        }
        System.out.println("Tersten Siralanisi:");
        String[] arr = colours.toArray(new String[colours.size()]);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }


    }
}
