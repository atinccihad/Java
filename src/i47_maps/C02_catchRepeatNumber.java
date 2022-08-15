package i47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_catchRepeatNumber {
    public static void main(String[] args) {
        /*
        Verilen birString'deki kullanilan harfleri
        ve kullanilan harflaerin tekrar sayisini
        H= 20 seklinde yazdirin
         */
        String str = "Heeeeellllooooo Woooorrrrllllllddddd";
        // space'leri saymamasi icin onlari yok edelim
        str = str.replaceAll("\\W", "");

        String[] harfler = str.split("");

        System.out.println(Arrays.toString(harfler));
        // [H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]
        // H=1 e=5 l=4 ...
        // harfleri key kullanim adedini value yapalim

        Map<String, Integer> harfKullanimSayilariMap = new HashMap<>();

        Integer harfKullanimSayisi;
        for (String each : harfler) {
            if (!harfKullanimSayilariMap.containsKey(each)) {
                harfKullanimSayilariMap.put(each, 1);
            } else {
                harfKullanimSayisi = harfKullanimSayilariMap.get(each);

                harfKullanimSayilariMap.put(each,++harfKullanimSayisi);
            }
        }
        System.out.println("harfKullanimSayilariMap = " + harfKullanimSayilariMap);

    }
}
