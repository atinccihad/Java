package i44_collections;

import java.util.HashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class R06 {
    public static void main(String[] args) {
        /*
        HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
        HashSet List: sari,mavi,kirmizi,yesil,mor
        ```
        Beklenen Çıktı:
        ``
        ```
        TreeSet elements:
        ``
        ```
        kirmizi
        ```
        mavi
        ```
        ```
        mor
        ```
        ```
        sari
        ```
        ```
        yesil
        ```
         */
        HashSet<String> colours = new HashSet<>();
        colours.add("sari");
        colours.add("mavi");
        colours.add("kirmizi");
        colours.add("yesil");
        colours.add("mor");
        TreeSet<String> coloursTree = new TreeSet<>();
        coloursTree.addAll(colours);

        System.out.println(coloursTree);
    }
}
