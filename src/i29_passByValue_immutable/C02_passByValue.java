package i29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_passByValue {
    public static void main(String[] args) {
        /*
        Birden fazla element iceren array ve arrayList gibi yapilarda
        passByValue gecerlidir.

        Eger method'da array veya List'in kendisi degistirilirse
        passByValue ozelligi sebebiyle Java degisen degeri degil
        array veya list'in orjinal degerini alir

        Ancak array veya List degistirilmeden sadece icindeki eleman degistirilirse
        Java obje degismedigi icin(referans ayni)
        ayni array veya List'i bize dondurur
        ancak icindeki elementler degismis olacaktir.
         */
        /*
        verilen 4 elemanli bir array'i
        method'a gonderelim
        method'da yeni 3 elemanli bir array atayip
        bu yeni array'e rastgele 100'den kucuk 3 sayi atayalim
        method'da array'i yazdiralim

        main method'da da method call'dan sonra yeniden method'u yazdiralim
         */

        int[] arr = {3, 5, 8, 10};

        arrayiDegistir(arr);
        System.out.println("method call'dan sonra main method'da array: " + Arrays.toString(arr));


    }

    public static void arrayiDegistir(int[] arr) {

        arr = new int[3];
        Random random = new Random();
        arr[0] = random.nextInt(100);
        arr[1] = random.nextInt(100);
        arr[2] = random.nextInt(100);

        System.out.println("method'da array: " + Arrays.toString(arr));
    }
}
