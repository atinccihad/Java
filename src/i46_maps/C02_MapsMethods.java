package i46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethods {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        // value'lari sira numarali olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);

        // Isim ve soyisimlerin birlikte olacagi bir liste olusturun
        List<String> sinifIsimSoyisimList = ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("sinifIsimSoyisimList = " + sinifIsimSoyisimList);


    }
}
