package i24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class R05 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.

        ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu

        ```
        Beklenen Çıktı:
        ```

        ```
        Arrayin 1. elemani: beyaz
        ```

        ```
        Arrayin 3. elemani: sari
        ```
         */
        List<String>colours=new ArrayList<>();
        colours.add("beyaz");
        colours.add("siyah");
        colours.add("sari");
        colours.add("kirmizi");
        colours.add("turuncu");

        for (int i = 0; i < colours.size(); i++) {
            System.out.println("Arrayin "+(i+1)+". elemani: "+colours.get(i));
        }

    }
}
