package i24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class R06 {
    public static void main(String[] args) {
        /*
        Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.

         Array Elemanları: sari,yesil,mavi,pembe

         **mavi rengini turuncu ile değiştirelim.**
         ```
         Beklenen Çıktı:
         ```
         [sari,yesil,mavi,pembe]
         ```
         [sari,yesil,turuncu,pembe]
         ```
         */
        List<String> colours=new ArrayList<>();
        colours.add("sari");
        colours.add("yesil");
        colours.add("mavi");
        colours.add("pembe");
        colours.set(2,"turuncu");
        System.out.println(colours);
    }
}
