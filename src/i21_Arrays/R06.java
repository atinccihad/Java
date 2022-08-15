package i21_Arrays;

import java.util.Scanner;

public class R06 {
    public static void main(String[] args) {
        /*
        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

        Array: [12,15,43,23,56,76,78,90,77,43]

        Aranan değer:56
        Beklenen Çıktı:
        56 sayısı arrayin 4. elemanı
         */
        int[] arr = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir deger girin: ");

        int deger = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (deger == arr[i]) {
                System.out.println(deger + " sayisi arrayin " + (i + 1) + ".elemani");
                break;
            }
        }
    }
}
