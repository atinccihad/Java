package i24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class R04 {
    public static void main(String[] args) {
        /*
        Array list oluşturun daha sonra aşağıda belirtilen yerlere yeni array elemanlarını ekleyen java kodunu yazınız.

         Array List:  siyah,mavi,kirmizi,beyaz

         en başa: **pembe**

         mavi-kirmizi arasına **yesil**  renk eklenecek.

         ```
         Beklenen Çıktı:
         ```

         ```
         [pembe,siyah,mavi,yesil,kirmizi,beyaz]
         ```
         */
        List<String> liste = new ArrayList<>();
        liste.add("siyah");
        liste.add("mavi");
        liste.add("kirmizi");
        liste.add("beyaz");

        liste.add(0, "pembe");
        liste.add(3, "yesil");
        System.out.println(liste);
    }
}
