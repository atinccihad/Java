package i24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class R07 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturun ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.
        ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu
        ```
        Beklenen Çıktı:
        ```
        Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
        ```
        siyah
        ```
        mavi
        ```
        kirmizi
        ```
        yesil
        ```
        mor
        ```
        turuncu
        ```       */
        List<String> list = new ArrayList<>();
        list.add("siyah");
        list.add("mavi");
        list.add("kirmizi");
        list.add("yesil");
        list.add("mor");
        list.add("turuncu");

        System.out.println("Orjinal array list: " + "[" + list.get(0) + "," + list.get(1) + "," + list.get(2) + "," + list.get(3) + "," + list.get(4) + "," + list.get(5) + "]");
    }
}
