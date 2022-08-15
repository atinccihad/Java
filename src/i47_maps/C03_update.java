package i47_maps;

import i46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_update {
    public static void main(String[] args) {
        /*
        map.contains(key) ==> verdigimiz key'in map'da olup olmadigini boolean olarak doner
        map.contains(value) ==> bir butun olarak value'nun map'da olup olmadigini doner

        ONEMLI NOT : map.contains(value)  value'nun icindeki bir parcayi bulmada ise yaramaz
                     eger value icindeki bir parcayi aratmak istiyorsak manipulation yapmaliyiz

         map.get(key) ==> verilen key'e ait degeri dondurur
         */

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false
        System.out.println(sinifListMap);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Devops, 105=Enes, Can, Tester, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester}

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true

        System.out.println(sinifListMap.containsValue("JDev")); // false

        // Verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace tum value'yu degistirmek istersek kullanilabilir
        // kismi degisiklerde kullanamayiz

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        // Map'i guncelleme yapmak icin key, yenideger'i map'e eklemeliyiz
        // ornegin key 101 icin value=Ali, Can, JDev
        // guncelleme icin sinifListMap.put

        // bunu yapabilmek icin herbir key'e ve ona ait value'ya ihtiyac var

        Set<Integer> keySeti = sinifListMap.keySet();
        String eachValue;

        for (Integer each : keySeti) {
            eachValue = sinifListMap.get(each);
            eachValue = eachValue.replace("JDev", "JavaDeveloper");
            sinifListMap.put(each, eachValue);
            /*
            biz key'lerin value'sunu aldik
            herbir key'in value'sunu getirdik
            value uzerinde degisikligi yapip
            yeni halini put(key, yeniDeger) ile map'e atadik
             */
        }
        System.out.println(sinifListMap);
        // {101=Ali, Can, JavaDeveloper, 102=Enes, Cem, Tester, 103=Taha, Emre, JavaDeveloper, 104=Derya, Deniz, Devops, 105=Enes, Can, Tester, 106=Taha, Deniz, JavaDeveloper, 107=Derya, Cem, Tester}

    }

}

