package i24_i01_anOverview;

import java.util.Arrays;
import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        /*
        34----
        yazılan değeri array içerisinde arayan Java Kodu yazınız.

        Array: [1551,1223,1443,1267,1789,1023,2020]


        Aranan Değer:2020
        Beklenen Çıktı:True

        Aranan Değer:2010
        Beklenen Çıktı :False
         */
        boolean cikti = false;
        Scanner scan = new Scanner(System.in);
        int arr[] = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        Arrays.sort(arr);

        System.out.println("Array icerisinde aramak istediginiz degeri giriniz");
        int deger = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (deger == arr[i]) {
                cikti = true;
            }
        }
        System.out.println(cikti);

    }
}
