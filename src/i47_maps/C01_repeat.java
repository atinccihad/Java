package i47_maps;

import i46_maps.ReusableMethods;

import java.util.Map;

public class C01_repeat {
        public static void main(String[] args) {
            Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();
            System.out.println(sinifListMap);
            // ogrenci listesini isim soyisim olarak yazdirin
            ReusableMethods.tumValueSiraliYazdir(sinifListMap);
            // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
            ReusableMethods.bransOgrencisayisiYazdir(sinifListMap);
        }
    }

