package i24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class R03 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.

        Array elemanları:  siyah,sari,mavi,turuncu

        ```
        Beklenen Çıktı:
        ```

        ```
        siyah
        ```

        ```
        sari
        ```

        ```
        mavi
        ```

        ```
        turuncu
        ```
         */
        List<String> list=new ArrayList<>();
        list.add("siyah");
        list.add("sari");
        list.add("mavi");
        list.add("turuncu");

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
