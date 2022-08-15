package i44_collections;

import java.util.LinkedList;

public class R05 {
    public static void main(String[] args) {
        /*
        Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.

        LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu

        **hint:  Collections.swap();**

        ```
        Beklene Çıktı:
        ```

        ```
        Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
        ```

        ```
        Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
        ```
         */
        LinkedList <String>colours=new LinkedList<>();
        colours.add("mavi");
        colours.add("kirmizi");
        colours.add("beyaz");
        colours.add("siyah");
        colours.add("yesil");
        colours.add("turuncu");
        System.out.println("Orjinal LinkedList: "+colours);
        String firstPerson=colours.getFirst();
        colours.set(0,"**"+colours.get(3)+"**");
        colours.set(3,"**"+firstPerson+"**" );
        System.out.println("Swap sonrası durum: "+colours);

    }
}
