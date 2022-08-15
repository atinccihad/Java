package i22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_mda {
    public static void main(String[] args) {
        /* tek katli array'lerde  array'i direk yazdiramiyoruz
         cunku array non-primitive data turudur ve
         her non primitive data direk yazdirilamayabilir.
         Ancak array'in icerisindeki elementleri direk yazdirabiliriz.
         Cunku genelde primitive data turu veya String kullanilir.
         Multi dimensional array'lerde en dikkat edecegimiz konu
         ulasmal istedigimiz elementin bir array mi
         yoksa primitive data mi oldugudur */

        int[][] sayilar = {{1, 2, 4, 5}, {3, 4}};
        /*
        burada sayilar arrayini dusunursek icinde 2 tane inner array var
        sayilar[0]==>[1,2,4,5]

        ancak en icerdeki elementlere ulasirsak direk yazdirabiliriz
         */
        System.out.println(sayilar[0]); // [I@1d251891
        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 4, 5]

        System.out.println(sayilar[0][1]); // 2
        System.out.println(sayilar[1][0]); // 3

        System.out.println(Arrays.toString(sayilar)); // [[I@1d251891, [I@48140564]
        System.out.println(Arrays.deepToString(sayilar)); // [[1, 2, 4, 5], [3, 4]]

        /*
        array'i 2 sekilde declare edebiliyorduk
        1-birincisinde elemanlari direk yazabiliriz
        2- outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz

        ancak 2. yontemle yaptigimizda inner arraylerin farkli uzunlukta olma ihtimali kalmaz
        bu ornek icin outer array'in 3 tane inner array'i vardir
        her bir array'in 4'er elemani vardir

        eger inner array'leri farkli uzunluklarda olusturmak
        istiyorsaniz mecburen birinci yontemi kullanmalisiniz
         */

    }
}
