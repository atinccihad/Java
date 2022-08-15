package i24_i01_anOverview;

import java.util.Arrays;

public class Q38 {
    public static void main(String[] args) {
        /*
         38----
        Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.

        Örnek -
        farkBul([10, 15, 20, 2, 10, 6])
        18
         */
        int arr[] = {10, 15, 20, 2, 10, 6};
        System.out.println("Array'deki enBuyuk sayi ile enKucuk sayi arasindaki fark: " + enBuyukEnKucukSayi(arr));
    }

    public static int enBuyukEnKucukSayi(int[] arr) {
        int enKucukSayi = 0;
        int enBuyukSayi = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            enKucukSayi = arr[0];
            enBuyukSayi = arr[arr.length - 1];
        }

        return enBuyukSayi - enKucukSayi;
    }
}
