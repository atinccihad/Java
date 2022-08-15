package i18_while_doWhileLoop;

public class R08 {
    public static void main(String[] args) {
        /*
        ‘A’ dan ‘z’ ye karakterlerin ascıı değerlerini basan bir Java programı yazın

         Beklenen Çıktı:

         Ascıı değeri
         a = 97 Ascıı değeri b = 98 Ascıı değeri
         c = 99 Ascıı değeri d = 100 Ascıı değeri
         e = 101 Ascıı değeri f = 102 Ascıı değeri
         g = 103 Ascıı değeri h = 104 Ascıı değeri
         ı = 105 Ascıı değeri j = 106 Ascıı değeri
         k = 107 Ascıı değeri l = 108 Ascıı değeri
         m = 109 Ascıı değeri n = 110 Ascıı değeri
         o = 111 Ascıı değeri p = S Ascıı değeri
         114 = r q 112 Ascıı değeri = 113 Ascıı değeri 122 z = değer Ascıı 121 = x, y = 120
         Ascıı değeri w = 119 Ascıı değeri v = 118 Ascıı değeri u = 117 Ascıı değeri Ascıı değeri 116 = t Ascıı değeri 115 =
         */
        char krk = 'a';
        int krkInt;


        char lastKrk = 'z';
        while (lastKrk >= krk) {
            krkInt = krk;
            System.out.println(krk + " = " + krkInt + " Ascıı değeri ");
            krk++;
        }
    }
}
