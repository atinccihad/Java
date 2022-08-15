package i29_i27_practice;

import java.util.*;

public class Q07 {
    public static void main(String[] args) {
         /*
        getSum isminde bir method oluşturun.
        Parametresi ArrayList'tir.
        Dizideki tüm $ ları kaldır ve tüm sayıları topla
        return yaptğımız veri tipi 'int' olmalıdır.
        sonuç 0'dan küçükse, -1 yazdırın.
        Örnek1:
        ArrayList = $13, $15, $20
        Cevap = 48 olmalı
        Örnek 2 :
        ArrayList= $-13, $0, $0
        Cevap = -1 olmalı.
        */

        List<String> arr =new ArrayList();
        arr.add(0,"$13");
        arr.add(1,"$15");
        arr.add(2,"$20");

        System.out.println(arr); //[$13, $15, $20]

        System.out.println(getSum(arr)); //48


    }

    public static int getSum(List<String> arr) {
        int toplam = 0;
        for (String each : arr
        ) {
            Integer sayi = Integer.parseInt(each.replaceAll("\\$",""));
            toplam += sayi;

        }
        if(toplam >=0){
            return toplam;
        }else
            return -1;
    }

}
