package i47_maps;

import com.sun.source.doctree.SeeTree;
import i46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_entryUpdate {
    public static void main(String[] args) {
        // soyismi can olanlarin bransini DataScience yapalim

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        // entry'leri alalim
        Set<Map.Entry<Integer, String>> entrySeti = sinifListMap.entrySet();

        String entryValue;
        String[] entryArr;
        for (Map.Entry<Integer, String> entry : entrySeti) {
            entryValue = entry.getValue();
            entryArr = entryValue.split(", ");

            if (entryArr[1].equals("Can")) {
                entryArr[2] = "DataScience";
                entry.setValue(entryValue = entryArr[0] + ", " + entryArr[1] + ", " + entryArr[2]);
            }
        }
        System.out.println(sinifListMap);
    }
}
