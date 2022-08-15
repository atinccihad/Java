package i24_i01_anOverview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        /*
        35----
        Methoda iki sayı girelim ve  bize bir array dönsün.
         Array elemanları 1.sayının 2. sayı kadar kendisi ile
         toplamından oluşsun.

        Test Data:
        arrayOfMultiples(7, 5)

        sonuç: [7,14,21,28,35]
         */

        int sayi1 = 7;
        int sayi2 = 5;
        List<Integer> sayi3 = arrayMultiple(sayi1, sayi2);
        System.out.println(sayi3);
    }

    private static List<Integer> arrayMultiple(int sayi1, int sayi2) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Iki sayi giriniz");
        sayi1 = scan.nextInt();
        sayi2 = scan.nextInt();

        List<Integer> sayi3 = new ArrayList<>();
        for (int i = 1; i <= sayi2 * i; i++) {
            if (i != sayi2 + 1) {
                sayi3.add(sayi1 * i);
            } else {
                break;
            }
        }
        return sayi3;
    }
}
