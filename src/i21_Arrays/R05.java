package i21_Arrays;

import java.util.Scanner;

public class R05 {
    public static void main(String[] args) {
        /*
        yazılan değerin array içerisinde arayan Java Kodu yazınız.

        Array: [1551,1223,1443,1267,1789,1023,2020]

        Aranan Değer:2020
        Beklenen Çıktı:**True**
        Aranan Değer:2010
        Beklenen Çıktı :**False**
         */
        boolean cikti = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir deger girin: ");
        int deger = scan.nextInt();
        int[] arr = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        for (int i = 0; i < arr.length; i++) {
            if (deger == arr[i]) {
                cikti = true;
            }
        }
        System.out.println("Aranan Değer: " + deger + "\nBeklenen Çıktı : " + cikti);

    }
}
